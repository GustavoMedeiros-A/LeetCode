class Solution {
    public String removeStars(String s) {
        char[] result = new char[s.length()];
        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == '*') {
                index--;
            } else {
                result[index++] = c;
            }
        }
        
        return new String(result, 0, index);
    }
}

