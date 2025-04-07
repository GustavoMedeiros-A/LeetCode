class Solution {
    public String convert(String s, int numRows) {
                if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            rows[currentRow].append(c);
            if(currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        final StringBuilder result = new StringBuilder();
        for (final StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}