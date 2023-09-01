/* 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
/*
    when i did this simple solution :
        class Solution {
            public boolean containsDuplicate(int[] nums) {
                int n = nums.length;
                for (int i=0 ; i < n - 1 ; i++){
                    for (int j=i+1 ; j < n ; j++){
                        if ( nums[i] == nums[j] ){    // nums[0]  !=  nums[3]
                            return true;
                        }
                    }
                }
                return false;
            }
        }
         
        i got in a case where the array is long 'Time Limit Exceeded'
*/