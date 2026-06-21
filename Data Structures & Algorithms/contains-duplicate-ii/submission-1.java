class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Brute Force
        for (int L = 0; L <nums.length; L++){
            for (int R = L+1; R< Math.min(nums.length,L+k+1); R++ ){
                if(nums[L] == nums[R] && Math.abs(L-R)<= k) return true;
            }
        }
        return false;
    }
}