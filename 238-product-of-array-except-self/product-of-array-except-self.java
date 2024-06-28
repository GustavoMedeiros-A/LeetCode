class Solution {
    public int[] productExceptSelf(int[] nums) {

int length = nums.length;

        int[] leftProduct = new int[length];
        int[] rightProduct = new int[length];
        int[] result = new int[length];

        leftProduct[0] = 1;

        for (int i = 1; i < length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
            System.out.println(String.format("leftProduct[%d] = %d", i, leftProduct[i]));
        }

        rightProduct[rightProduct.length - 1] = 1;
        for (int i = rightProduct.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }
}