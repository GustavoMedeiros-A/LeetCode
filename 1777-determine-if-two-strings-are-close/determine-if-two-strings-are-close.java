class Solution {
    public boolean closeStrings(String word1, String word2) {
        // verify length
        if(word1.length() != word2.length()) {
            return false;
        }

        // Set is a collection that contains no duplicate elements.
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for (char c : word1.toCharArray()) {
            set1.add(c);
        }

        for (char c : word2.toCharArray()) {
            set2.add(c);
        }

        if(!set1.equals(set2)) {
            return false;
        }

        // Creare frequency MAP to store the frequency of the letters
        HashMap<Character, Integer> freq1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> freq2 = new HashMap<Character, Integer>();

        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        List<Integer> freq1List = new ArrayList<>(freq1.values());
        List<Integer> freq2List = new ArrayList<>(freq2.values());

        Collections.sort(freq1List);
        Collections.sort(freq2List);

        return freq1List.equals(freq2List);
    }
}


