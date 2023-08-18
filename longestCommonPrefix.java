/*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
*/ 
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs == null || strs.length == 0) {
            return "";  // Return an empty string if the input is empty or null
        }
        
        for (int i=0 ; i<strs[0].length() ; i++){   //.length() is for strings and .length is for arrays 
            for (int j=1 ; j<strs.length ; j++){
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){ //i >= strs[j].length() || ensures that there is that index in the word 
                    return prefix;
                }
            }
            //if we exit this loop it means that there's a new character that exists in all the words
            prefix += strs[0].charAt(i);
        }
        return prefix ;
    }
}
