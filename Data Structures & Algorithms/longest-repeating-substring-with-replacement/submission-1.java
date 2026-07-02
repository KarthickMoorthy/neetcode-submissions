class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        Set<Character> seenSet = new HashSet<>();

        // Add the unique character to the Set
        for (int i = 0; i < s.length(); i++) {
            seenSet.add(s.charAt(i));
        }

        // Pick character and go as far as I can with max k replacements
        for (char c : seenSet) {
            int count = 0;
            int L = 0;
            for (int R = 0; R < s.length(); R++) {
                if (s.charAt(R) == c) {
                    count++;
                }
                // Number of character which do not match charcter c exceeds k
                while ((R - L + 1) - count > k) {
                    if (s.charAt(L) == c) {
                        count--;
                    }
                    L++;
                }

                maxLength = Math.max(R - L + 1, maxLength);
            }
        }

        return maxLength;
    }
}
