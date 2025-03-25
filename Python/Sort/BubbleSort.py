class Solution(object):
    def sortArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        for i in range(len(nums)-1, 0, -1):
            for j in range(i):
                if nums[j] > nums[j+1]:
                    nums[j], nums[j+1] = nums[j+1], nums[j]
        return nums
    
n1 = [ 5, 6, 7, 3, 23, 6, 7, 87, 33 ]
n2 = [ 6, 6, 5, 7, 65, 34, 4, 57, 68, 3 ]
Solution = Solution()
print(Solution.sortArray(n1))
print(Solution.sortArray(n2))