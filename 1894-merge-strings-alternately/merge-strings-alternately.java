class Solution {
    public String mergeAlternately(String word1, String word2) {
        String bigger, smaller;
        if (word1.length() > word2.length()) {
            bigger = word1;
            smaller = word2;
        } else {
            bigger = word2;
            smaller = word1;
        }

        StringBuilder newWord = new StringBuilder();
        int lengthSmaller = smaller.length();

        for(int i = 0; i < lengthSmaller; i++) {
            newWord.append(word1.charAt(i));
            newWord.append(word2.charAt(i));
        }

        newWord.append(bigger.substring(lengthSmaller));
        
        return newWord.toString();

    }
}