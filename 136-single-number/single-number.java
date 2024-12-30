class Solution {
    public int singleNumber(final int[] nums) {
        int result = 0;

        for(final int num : nums) {
            result ^= num;

        }

        return result;
    }
}