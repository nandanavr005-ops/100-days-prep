/*
 * Problem: LeetCode 26 - Remove Duplicates from Sorted Array
 * Striver Sheet: Step 3.1 (Arrays - Easy #4)
 * Pattern: Two Pointers (Slow / Fast)
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
      //let the last unique element be:
      int i = 0;
      int j;
       for ( j = 1 ; j < nums.length; j++){
        if(nums[j] != nums[i]){
         i=i+1;
         nums[i] = nums[j];
        }
       }
       return i+1;
        }
        
    
}
