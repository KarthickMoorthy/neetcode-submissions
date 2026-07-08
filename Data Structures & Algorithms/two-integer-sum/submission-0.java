class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> trackerMap = new HashMap<>();

        for(int i=0;i<nums.length; i++){
         int diff = target - nums[i];

         if(trackerMap.containsKey(diff)) return new int[]{trackerMap.get(diff),i};

         trackerMap.put(nums[i], i);
        }

        return new int[0];
    }
}
