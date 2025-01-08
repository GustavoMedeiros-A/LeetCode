class Solution {
    public boolean containsDuplicate(int[] nums) {
                final HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(final int num : nums) {
            if(hashMap.containsKey(num)) {
                return true;
            }
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        
        return false;
    }
}