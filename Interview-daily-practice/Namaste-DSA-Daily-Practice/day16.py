class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        f=n*(n+1)//2
        return f-sum(nums)

#O(n)  ---time complexity
#O(1)  ---space complexity