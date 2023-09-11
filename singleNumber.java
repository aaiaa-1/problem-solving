/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++){
            if (values.containsKey(nums[i])){
                values.put(nums[i], values.get(nums[i]) + 1);
            }else{
                values.put(nums[i],1);
            }
        }

        for (int key : values.keySet()) {
            if (values.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}
