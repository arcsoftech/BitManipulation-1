// Time Complexity :  O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes Its working
// Any problem you faced while coding this : No
class Solution {
    public int singleNumber(int[] nums) {
      int a = 0;
      for (int i : nums) {
        a ^= i; // Number xor by itself turns out to be zero
      }
      return a;
    }
  }