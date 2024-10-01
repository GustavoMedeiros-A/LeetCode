class Solution {
    public int[] runningSum(int[] nums) {
        final int[] values = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            values[i] = sum;
        }

    return values;
    }
}