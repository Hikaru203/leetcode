from math import sqrt

class Solution(object):
    def constructRectangle(self, s):
        """
        :type area: int
        :rtype: List[int]
        """
        # Cách này nhanh hơn
        stop=int(sqrt(s))
        b=[]
        c=[]
        for l in range(1,stop+1):
            if s%l==0:
                b.append(l)
                c.append(s/l-l)
        id=c.index(min(c))    
        return [s/b[id],b[id]]
        # for i in range(int(area**0.5), 0, -1):
        #     if area % i == 0:
        #         return [area//i, i]
        # return [area, 1]
    
    
    
solution = Solution()
print(solution.constructRectangle(4))