class Solution {
    public boolean containsDuplicate(int[] nums) {
        final Set<Integer> hashSet = new HashSet<>();

        for(final int num : nums) {
            if(hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }

        return false;
    }
}