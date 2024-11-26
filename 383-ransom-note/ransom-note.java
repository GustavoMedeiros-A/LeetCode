class Solution {
    public boolean canConstruct(final String ransomNote, final String magazine) {
        final HashMap<Character, Integer> charCount = new HashMap<>();

        // Add the Character and the Number of character that exists
        for(final char ch : magazine.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (final char ch : ransomNote.toCharArray()) {
            if(!charCount.containsKey(ch) || charCount.get(ch) == 0) {
                return false;
            }

            charCount.put(ch, charCount.get(ch) - 1);
        }

        return true;
        

    }
}