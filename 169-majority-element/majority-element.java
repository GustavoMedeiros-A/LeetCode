class Solution {
    public int majorityElement(int[] nums) {
                HashMap<Integer, Integer> countMap = new HashMap<>();
        int lenght = nums.length;

        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if(countMap.get(num) > lenght / 2) {
                return num;
            }
        }

        return -1;
    }
}