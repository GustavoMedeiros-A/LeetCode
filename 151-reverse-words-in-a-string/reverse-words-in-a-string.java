class Solution {
    public String reverseWords(String s) {
       String[] wordsArray = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for (int i = wordsArray.length; i > 0; i--) {
            reversed.append(wordsArray[i - 1]);
            if (i > 1) {
                reversed.append(" ");
            }
        }

        String newString = new String(reversed.toString());

        return newString;
    }
}