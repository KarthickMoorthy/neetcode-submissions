class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0; 
        int maxSum = nums[0];

        for(int i=0; i<nums.length; i++){
            currentSum = Math.max(currentSum, 0);
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);   
        }

        return maxSum;
    }
}
