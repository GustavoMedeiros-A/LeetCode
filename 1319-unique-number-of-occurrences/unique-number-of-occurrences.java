class Solution {
       public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> integerMap = new HashMap<>();

        for (int num : arr) {
            integerMap.compute(num, (key, value) -> (value == null)  ? 1 : value + 1);
        }
        HashSet<Integer> seenValues = new HashSet<>();

        for(int values : integerMap.values()) {
            if(!seenValues.add(values)) {
                return false;
            }
        }
        return true;
    }
}