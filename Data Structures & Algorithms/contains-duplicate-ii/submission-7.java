class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Sliding window - fixed - Hashmap
        HashMap<Integer, Integer> window = new HashMap<>();
        for(int R = 0; R<nums.length; R++){
          if(window.containsKey(nums[R]) && (R - window.get(nums[R])) <= k ) return true;
          // Add elements to the window
          window.put(nums[R], R);
        }

      return false;
    }
}