package Java;

class _9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int originalNumber = x;
        int reverse = 0;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        return originalNumber == reverse;
    }
}