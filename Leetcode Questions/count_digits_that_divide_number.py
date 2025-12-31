class Solution:
    def countDigits(self, num: int) -> int:
        original=num
        count=0
        while original>0:
            r=original%10
            if num%r==0:
                count+=1
            original=original//10
        return count

