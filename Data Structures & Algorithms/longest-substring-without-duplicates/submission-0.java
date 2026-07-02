class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0; 
        int maxLength = 0;
        Set<Character> seenSet = new HashSet<>();
        for (int R = 0; R<s.length(); R++){
           while(seenSet.contains(s.charAt(R))){
              seenSet.remove(s.charAt(L));
              L++;
           } 
           seenSet.add(s.charAt(R));
           maxLength = Math.max(maxLength, R-L+1);
           
        }

        return maxLength;
    }
}
