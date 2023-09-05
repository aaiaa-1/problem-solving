/*
    Given two binary strings a and b, return their sum as a binary string.
        Example 1:
            Input: a = "11", b = "1"
            Output: "100"
*/
class Solution {
    public String addBinary(String a, String b) {
        int n = Math.max(a.length(), b.length()); // Get the maximum length
        StringBuilder result = new StringBuilder();  // Unlike regular strings that are immutable (cannot be changed after creation), StringBuilder allows you to modify its content by appending, inserting, or replacing characters
        char carry = '0';

        // Pad both strings to have the same length
        a = padString(a, n);
        b = padString(b, n);

        for (int i = n - 1; i >= 0; i--) { // from right to left
            char bitA = a.charAt(i);
            char bitB = b.charAt(i);
            
            if (bitA == '1') {
                if (bitB == '1') {
                    result.insert(0, carry); // we will keep inserting the result of the binary op at thebeginning of the result string
                    carry = '1';
                } else { //bitB == 0 && bitA == 1 
                    result.insert(0, carry == '0' ? '1' : '0'); //if carry = 0 then insert 1 if it isnt insert 0
                }
            } else {
                if (bitB == '1') { 
                    result.insert(0, carry == '0' ? '1' : '0');
                } else {
                    result.insert(0, carry);
                    carry = '0';
                }
            }
        }
        
        if (carry == '1') { //once we loop through all the binary numbers we check if the carry still has 1, if so we insert it at the beginning
            result.insert(0, carry);
        }

        return result.toString();
    }

      // Pad the string to a specified length with leading zeros
    private String padString(String s, int length) {
        int diff = length - s.length();
        if (diff > 0) {
            return "0".repeat(diff) + s;
        }
        return s;
    }
}
