class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            if(i + needle.length() > haystack.length()) {
                return -1;
            }
            final String window = haystack.substring(i, i + needle.length());
            if(window.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}