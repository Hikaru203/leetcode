from math import sqrt

class Solution(object):
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        for i in range(int(area**0.5), 0, -1):
            if area % i == 0:
                return [area//i, i]
        return [area, 1]
    
    
    
solution = Solution()
print(solution.constructRectangle(4))