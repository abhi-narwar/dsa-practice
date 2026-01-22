# This is a brute-force solution with O(n^2) time complexity.
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]


# This is an optimized solution with O(n) time complexity using a hash map.

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp={}
        for i,num in enumerate(nums):
            rem=target-num
            if rem in mp:
                return [mp[rem],i]
            mp[num]=i

