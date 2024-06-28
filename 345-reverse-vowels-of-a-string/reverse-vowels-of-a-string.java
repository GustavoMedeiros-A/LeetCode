class Solution {
     public String reverseVowels(String word) {

        // Hash mapping is more fast
        // After a careful research i find a site
        // That tell that hashMap have better performance
        // https://www.baeldung.com/java-treemap-vs-hashmap#:~:text=HashMap%2C%20being%20a%20hashtable%2Dbased,significantly%20faster%20than%20a%20TreeMap.
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }
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