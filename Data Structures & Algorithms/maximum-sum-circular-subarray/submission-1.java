class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int currentMin = 0;
      int currentMax =  0;
      int maxSum = nums[0];
      int minSum = nums[0];
      int totalSum = 0;

      for (int num : nums) {
        currentMax = Math.max(num, currentMax+num);
        maxSum = Math.max(currentMax, maxSum);
        currentMin = Math.min(num, num+currentMin);
        minSum = Math.min(currentMin, minSum);
        totalSum += num;
      } 

      if (totalSum == minSum) return maxSum;

      return Math.max(totalSum-minSum, maxSum);
      
    }
}