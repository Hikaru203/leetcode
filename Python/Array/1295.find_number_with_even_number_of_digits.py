
class Solution(object):
    def findNumbers(self, nums):
        total = 0
        # for num in nums:
        #     count =0
        #     while num > 0:
        #         num = num // 10
        #         count += 1
        #     if count % 2 == 0:
        #         total += 1

        #Python dùng so sánh len String nhanh hơn là while
        for num in nums:
            if len(str(num)) % 2 == 0 :
                total += 1
        return total
    
nums = [12, 345, 2, 6, 7896]
solution = Solution()
print(solution.findNumbers(nums))
                
        
        
