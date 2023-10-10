/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

class Solution {
public:
    int lengthOfLastWord(string s) {
        int count = 0;
        int n = s.length()-1;
        
        for ( int i=n ; i>=0 ; i--){
            if (s[i] != ' ')
                count ++;
            else{
                if (count > 0) {
                    break;
                }
            }
        }
        
        return count ;
    }
};