class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> sCounterMap = new HashMap<>();
        Map<Character, Integer> tCounterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sCounterMap.put(s.charAt(i), sCounterMap.getOrDefault(s.charAt(i), 0) + 1);
            tCounterMap.put(t.charAt(i), tCounterMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        if(sCounterMap.equals(tCounterMap)) return true;

        return false;
    }
}
