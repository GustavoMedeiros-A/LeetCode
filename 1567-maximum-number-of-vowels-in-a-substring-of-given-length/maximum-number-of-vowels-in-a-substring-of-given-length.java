class Solution {
    public int maxVowels(String s, int k) {

        boolean[] isVowel = new boolean[128];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;
        isVowel['A'] = true;
        isVowel['E'] = true;
        isVowel['I'] = true;
        isVowel['O'] = true;
        isVowel['U'] = true;


        int maxVowels = 0;
        int currentVowel = 0;

        // Initialize the window and find the first values
        for (int i = 0; i < k; i++) {
            if (isVowel[s.charAt(i)]) {
                currentVowel++;
            }
        }

        maxVowels = currentVowel;

        for (int i = k; i < s.length(); i++) {
            // Remove the currentVowel if that the value that is out of the window now is
            // not a VOWELS
            if (isVowel[s.charAt(i - k)]) {
                currentVowel--;
            }
            // Add the new vowel if that the value that is in the window now is a VOWELS
            if (isVowel[s.charAt(i)]) {
                currentVowel++;
            }

            maxVowels = Math.max(maxVowels, currentVowel);

        }

        return maxVowels;

    }
}