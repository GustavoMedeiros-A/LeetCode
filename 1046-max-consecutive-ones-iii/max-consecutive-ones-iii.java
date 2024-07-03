class Solution {
 public int longestOnes(int[] nums, int k) {
        // Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2

        int left = 0;
        int zerosCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCount++;
            }

            while (zerosCount > k) {
                if (nums[left] == 0) {
                    zerosCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}