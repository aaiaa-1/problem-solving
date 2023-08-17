/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.

    

    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
*/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> sumIndices(2, -1);   //i used vector instead of array cause vectors are designed to be returned from functions and can be easily manipulated, resized, and accessed. and because arrays are not directly returnable in cpp.
        for (int i = 0 ; i < nums.size() ; i++){
            for (int j = i + 1 ; j < nums.size() ; j++){  
                if (nums[j] + nums[i] == target){
                    sumIndices[0] = i;
                    sumIndices[1] = j;
                    return sumIndices ;  
                }
            }
        }
        return {};  // Return an empty vector if no solution is found
    }
};


