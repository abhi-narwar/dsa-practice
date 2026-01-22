class Solution:
    def secondHighest(self, s: str) -> int:
        digits = set()
        
        for i in s:
            if i.isdigit():
                digits.add(int(i))
        
        if len(digits) < 2:
            return -1
        
        digits = sorted(digits)
        return digits[-2]



#O(n) time complexity solution O(1) space complexity

class Solution:
    def secondHighest(self, s: str) -> int:
        largest = -1
        second_largest = -1

        for ch in s:
            if ch.isdigit():
                digit = int(ch)

                if digit > largest:
                    second_largest = largest
                    largest = digit
                elif largest > digit > second_largest:
                    second_largest = digit

        return second_largest
