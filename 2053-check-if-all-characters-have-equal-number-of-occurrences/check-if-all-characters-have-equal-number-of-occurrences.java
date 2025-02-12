class Solution {
    public boolean areOccurrencesEqual(String s) {
                final HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        if(map.isEmpty()) {
            return true;
        }

        final int expectValue = map.values().iterator().next();

        for(final int frequece : map.values()) {
            if(expectValue != frequece) {
                return false;
            }
        }

        return true;


    }
}