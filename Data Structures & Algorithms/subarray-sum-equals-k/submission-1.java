class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;
        int result = 0;
        prefixSumMap.put(0, 1);

        //Create the prefix sum tracker with frequency
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            int diff = currentSum - k;
            result += prefixSumMap.getOrDefault(diff, 0);

            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0)+1);
        }

        return result;
    }
}