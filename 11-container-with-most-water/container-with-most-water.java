class Solution {
     public int maxArea(int[] height) {
        int pointer = 0;
        int width = height.length;
        int maxArea = 0;
        int minHeight = 0;

        while (pointer < width) {
            int leftHeight = height[pointer];
            int rightHeight = height[width - 1];

            if (leftHeight < rightHeight) {
                minHeight = leftHeight;
            } else {
                minHeight = rightHeight;
            }
            int product = minHeight * (width - pointer - 1);
            if (product > maxArea) {
                maxArea = product;
            }
            if (leftHeight <= rightHeight) {
                pointer++;
            } else {
                width--;
            }

        }

        return maxArea;
    }
}