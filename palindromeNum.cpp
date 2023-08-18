class Solution {
public:
    bool isPalindrome(int x) {
        //first case where the number is for sure not palindrome is if its a negative number
        if (x < 0) {
            return false;  
        }
        
        int original = x;
        long long reversed = 0;
        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
};