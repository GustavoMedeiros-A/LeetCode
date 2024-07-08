class Solution {
       public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> integerMap = new HashMap<>();

        for (int num : arr) {
             integerMap.put(num, integerMap.getOrDefault(num, 0) + 1);
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