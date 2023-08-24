class Solution {
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
