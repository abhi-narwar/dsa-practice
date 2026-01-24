class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        return n > 0 and (n & (n - 1)) == 0
    
#O(1)  ---time complexity
#O(1)  ---space complexity

# A power of two has exactly one set bit in binary, so n & (n - 1) becomes zero.