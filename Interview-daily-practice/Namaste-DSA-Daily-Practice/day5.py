class Solution:
    def countNegatives(self, grid):
        rows = len(grid)
        cols = len(grid[0])

        i = 0          # row
        j = cols - 1   # column (top-right)
        count = 0

        while i < rows and j >= 0:
            if grid[i][j] < 0:
                count += (rows - i)
                j -= 1
            else:
                i += 1

        return count


#O(m + n)  ---time complexity


#O(1)      ---space complexity