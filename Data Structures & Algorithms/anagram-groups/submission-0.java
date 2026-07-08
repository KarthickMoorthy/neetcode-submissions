class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> trackerMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if (!trackerMap.containsKey(sortedS)) {
                trackerMap.put(sortedS, new ArrayList<>());
            }
            trackerMap.get(sortedS).add(str);
        }

        return new ArrayList<>(trackerMap.values());
    }
}
