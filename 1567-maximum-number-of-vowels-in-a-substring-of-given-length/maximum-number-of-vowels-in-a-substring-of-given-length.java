class Solution {
    public int maxVowels(String s, int k) {

        String vowels = "aeiou";
        int maxVowels = 0;
        int currentVowel = 0;

        // Initialize the window and find the first values
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) { // -1 is if the indexOf not found the index
                currentVowel++;
            }
        }

        maxVowels = currentVowel;

        for (int i = k; i < s.length(); i++) {
            // Remove the currentVowel if that the value that is out of the window now is
            // not a VOWELS
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentVowel--;
            }
            // Add the new vowel if that the value that is in the window now is a VOWELS
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowel++;
            }

            maxVowels = Math.max(maxVowels, currentVowel);

        }

        return maxVowels;

    }
}