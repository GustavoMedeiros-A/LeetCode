class Solution {
    public int lengthOfLongestSubstring(String s) {
        final Map<String, Integer> map = new HashMap<>();
        if(s.isEmpty()) {
            return 0;
        }
        final String[] split = s.split("");

        int start = 0;
        int maxLenght = 0;
        for (int i = 0; i < split.length; i++) {

            if(map.containsKey(split[i]) && map.get(split[i]) >= start) {
                start = map.get(split[i]) + 1;
            }
            map.put(split[i], i);
            maxLenght = Math.max(maxLenght, i - start + 1);
        }
        return maxLenght;
    }
}