class Solution(object):
    def SelectionSort(self, nums):
        for i in range(len(nums)-1):
            min = i
            for j in range(i+1, len(nums)):
                if nums[j] < nums[min]:
                    min = j
            nums[i], nums[min] = nums[min], nums[i]
            print("Pass " + str(i) + ": " + str(nums))
        return nums
    
nums = [12, 345, 2, 6, 7896]
solution = Solution()
print(solution.SelectionSort(nums))