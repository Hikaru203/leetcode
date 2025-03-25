class Solution(object):
    def InsertionSort(self, nums):
        for i in range(1, len(nums)):
            int = nums[i]
            j = i - 1
            while j >= 0 and nums[j] > int:
                nums[j + 1] = nums[j]
                j -= 1
            nums[j + 1] = int
            print("Pass " + str(i) + ": " + str(nums))
        return nums
    
n1 = [ 5, 6, 7, 3, 23, 6, 7, 87, 33 ]
n2 = [ 6, 6, 5, 7, 65, 34, 4, 57, 68, 3 ]
Solution = Solution()
print(Solution.InsertionSort(n1))
print(Solution.InsertionSort(n2))