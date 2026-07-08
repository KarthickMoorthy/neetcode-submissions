class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> trackerSet = new HashSet<>();
       for(int num:nums){
         if(trackerSet.contains(num)) return true;
         trackerSet.add(num);
       }

       return false;
    }
}