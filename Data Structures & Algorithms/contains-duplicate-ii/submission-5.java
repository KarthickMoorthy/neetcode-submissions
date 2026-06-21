class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      // Sliding window - fixed - HashSet
      HashSet<Integer> window = new HashSet<Integer>();
      int L = 0;
      for(int R = 0; R < nums.length; R++){
        // remove from window 
        if (R-L > k){
            window.remove(nums[L]);
            L++;
        }

        // Condition check
        if(window.contains(nums[R])) return true;

        // Add to window
        window.add(nums[R]);
      }

      return false;
    }
        
}