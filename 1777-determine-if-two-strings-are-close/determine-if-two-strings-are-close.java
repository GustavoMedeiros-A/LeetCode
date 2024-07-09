class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];
        
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            charCount1[c - 'a'] = 1;
        }
        
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            charCount2[c - 'a'] = 1;
        }
        
        // Check if both strings have the same unique characters
        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }
        
        // Count the frequencies of the frequencies
        int[] freqCount1 = new int[word1.length() + 1];
        int[] freqCount2 = new int[word2.length() + 1];
        
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > 0) {
                freqCount1[freq1[i]]++;
            }
            if (freq2[i] > 0) {
                freqCount2[freq2[i]]++;
            }
        }
        
        // Compare the frequency counts
        for (int i = 0; i <= word1.length(); i++) {
            if (freqCount1[i] != freqCount2[i]) {
                return false;
            }
        }
        
        return true;
    }
}


