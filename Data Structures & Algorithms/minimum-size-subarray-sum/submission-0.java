class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int L = 0;
        int minLength = nums.length+1;

        for (int R = 0; R<nums.length; R++){
            sum += nums[R];

            while(sum>=target){
                minLength = Math.min(minLength, R-L+1);
                sum -= nums[L];
                L++;
            }
        }

        return minLength == nums.length+1 ? 0: minLength;
    }
}