class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> integerMap = new HashMap<>();

        for (int num : arr) {
            if(integerMap.containsKey(num)) {
                integerMap.put(num, integerMap.get(num) + 1); // here increment the occurrences of hashMap
            } else {
                integerMap.put(num, 1); // 1 is the first occurence
            }
        }
        HashSet<Integer> seenValues = new HashSet<>();

        for(int values : integerMap.values()) {
            if(!seenValues.contains(values)) {
                seenValues.add(values);
            } else {
                return false;
            }
        }
        return true;
    }

}