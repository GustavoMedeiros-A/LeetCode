class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int [] counts = new int[26];


        for (final char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for(final char c : t.toCharArray()) {
            if(--counts[c - 'a'] < 0) {
                return false;
            };
        }

        return true;

    }
}