class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        i = m - 1          # pointer for nums1
        j = n - 1          # pointer for nums2
        k = m + n - 1      # pointer for nums1 end

        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1

        # agar nums2 ke elements bache ho
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
            
#O(m+n)  ---time complexity
#O(1)    ---space complexity