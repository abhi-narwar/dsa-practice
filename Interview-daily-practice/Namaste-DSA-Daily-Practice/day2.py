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
