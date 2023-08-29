/*
    Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
    such that nums[i] == nums[j] and abs(i - j) <= k.
*/

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int abs =i-map.get(nums[i]);  // map.get(nums[i]) returns the value associated with nums[i] which is "i"
                        //or we could use Math.abs(map.get(nums[i])-i) to get the positive value
                if ( abs <= k ){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
