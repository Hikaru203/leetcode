class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        return max(map(sum, accounts))

accounts = [[1, 5], [7, 3], [3, 5]]
solution = Solution()
print(solution.maximumWealth(accounts))