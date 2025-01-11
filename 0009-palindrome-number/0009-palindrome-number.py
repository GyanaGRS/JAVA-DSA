class Solution:
    def isPalindrome(self, x: int) -> bool:
        y=str(x)
        z="".join(reversed(y))
        return y==z

        