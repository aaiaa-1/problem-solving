/* 
 Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
    For example:
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28 

            Example 1:
                Input: columnNumber = 1
                Output: "A"
            Example 2:
                Input: columnNumber = 28
                Output: "AB"
            Example 3:
                Input: columnNumber = 701
                Output: "ZY"
*/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            // Convert the columnNumber to 0-based index by subtracting 1
            columnNumber--;

            // Calculate the remainder (0-25) which corresponds to A-Z
            int remainder = columnNumber % 26;

            // Convert the remainder to its corresponding character and append to the result
            char currentChar = (char) ('A' + remainder);
            result.insert(0, currentChar);

            // Update columnNumber for the next iteration
            columnNumber /= 26;
        }

        return result.toString();
    }
}
