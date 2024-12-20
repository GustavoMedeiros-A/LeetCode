class Solution {
    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0){
            return triangle;
        }
        final List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);

        for(int i = 1; i < numRows; i++){
            final List<Integer> newRow = new ArrayList<>();
            final List<Integer> prevRow = triangle.get(i - 1);
            newRow.add(1);
            for(int j = 1; j < prevRow.size(); j++){
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            newRow.add(1);
            
            triangle.add(newRow);
        }

        return triangle;
    }
}