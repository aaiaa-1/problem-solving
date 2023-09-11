/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

//this is a really interesting solution for the problem

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int result = 0;
        for (int num : nums) {  
            result ^= num;  //The XOR operation has the property that if you XOR the same number twice, 
                            //it cancels out, leaving you with 0. For example: x ^ x = 0. 
                            //So, by XORing result with all the elements in the array, duplicate numbers will cancel each other out, 
                            //and the final result will be the single number.
        }
        return result;
    }
};