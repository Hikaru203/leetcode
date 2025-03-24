class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        """
        :type word1: List[str]
        :type word2: List[str]
        :rtype: bool
        """
        return "".join(word1) == "".join(word2)
        
    

str1 = ["ab", "c"]
str2 = ["a", "bc"]

print(Solution().arrayStringsAreEqual(str1, str2))