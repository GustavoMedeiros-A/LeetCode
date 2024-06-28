class Solution {
     public String reverseVowels(String word) {

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            // If not contain, plus start++
            if (!vowels.contains(charArray[start])) {
                start++;
                // If cannot find vowels in the last, end--
            } else if (!vowels.contains(charArray[end])) {
                end--;
                // now if both is false, swap
            } else {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        String newWord = new String(charArray);
        return newWord;
    }
}