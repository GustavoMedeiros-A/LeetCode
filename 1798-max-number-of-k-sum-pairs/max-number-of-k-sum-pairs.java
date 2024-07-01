class Solution {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int operations = 0;
        int firstPointer = 0;
        int secondPointer = nums.length - 1;

        while (firstPointer < secondPointer) {
            if (nums[firstPointer] + nums[secondPointer] == k) {
                firstPointer++;
                secondPointer--;
                operations++;
            } else if (nums[firstPointer] + nums[secondPointer] < k) {
                firstPointer++;
            } else {
                secondPointer--;
            }

        }

        return operations;
    }


}