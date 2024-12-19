class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) {
            return triangle;
        }
        final List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);


        for (int i = 1; i <= numRows - 1; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j = 1; j < prevRow.size(); j++) {
                nextRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            nextRow.add(1);

            triangle.add(nextRow);

        }
        
        return triangle;
    }
}