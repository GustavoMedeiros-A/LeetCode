class Solution {
    public int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for (int num : nums) {
            maxSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = maxSum - leftSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }


        return -1;
    }
}