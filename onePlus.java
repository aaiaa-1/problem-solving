/*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
        
    Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
*/

class Solution1 {
    public int[] plusOne(int[] digits) {
        return addOne(digits, digits.length - 1);
    }
    // this problem has to be solved recursively 
    private int[] addOne(int[] digits, int index) {
        if (index < 0) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            return newArray;
        }

        if (digits[index] == 9) {
            digits[index] = 0;
            return addOne(digits, index - 1);
        } else {
            digits[index]++;
            return digits;
        }
    }
}


//my previous implementation
//class Solution0 {
//    public int[] plusOne(int[] digits) {
//        int i = 0;
//        while ( i!= digits.length - 1){
//            i++;
//        }
//        if (digits[i] == 9){
//            int[] newArray = new int[digits.length + 1];
//            System.arraycopy(digits, 0, newArray, 0, digits.length);
//            newArray[i]=1;
//            newArray[i+1]=0;
//            return newArray;
//        }
//        digits[i]++;
//        return digits;
//    }
//}