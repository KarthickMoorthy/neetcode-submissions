class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window; Optimal ; time O(n) space O(m)
        int L=0;
        int maxlength = 0;
        Map<Character, Integer> trackerMap = new HashMap<>();

        for (int R=0; R<s.length(); R++){

            // Act on Seen
            if(trackerMap.containsKey(s.charAt(R))){
                L = Math.max(trackerMap.get(s.charAt(R)) + 1, L);
            }

            trackerMap.put(s.charAt(R), R);
            maxlength = Math.max(maxlength, R-L+1);
        }

        return maxlength;
    }
}
