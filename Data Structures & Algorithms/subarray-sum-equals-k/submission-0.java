class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        prefixSumMap.put(0, 1);
        int curSum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            int diff = curSum - k;
            result += prefixSumMap.getOrDefault(diff, 0);

            prefixSumMap.put(curSum, prefixSumMap.getOrDefault(curSum, 0)+1);
        }

        return result;
    }
}