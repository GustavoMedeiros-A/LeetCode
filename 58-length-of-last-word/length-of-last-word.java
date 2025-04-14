class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        final String[] split = s.split(" ");

        return split[split.length - 1].length();
    }
}