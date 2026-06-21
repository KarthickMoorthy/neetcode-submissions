class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMin = 0;
        int currentMax = 0;
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int item : nums) {
            currentMax = Math.max(currentMax, 0) + item;
            maxSum = Math.max(currentMax, maxSum);
            currentMin = Math.min(currentMin, 0) + item;
            minSum = Math.min(currentMin, minSum);
            totalSum += item;
        }
        if (minSum == totalSum) return maxSum;
        return Math.max(totalSum - minSum, maxSum);
    }
}