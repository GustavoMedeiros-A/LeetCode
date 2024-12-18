/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 public TreeNode sortedArrayToBST(final int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }


        return recursiveHelper(nums, 0, nums.length);
    }

    private TreeNode recursiveHelper(final int[] nums, final int start, final int end) {
        if (start >= end) {
            return null;
        }
        final int middle = (start + end) / 2;
        final TreeNode node = new TreeNode(nums[middle]);
        node.left = recursiveHelper(nums, start, middle);
        node.right = recursiveHelper(nums, middle + 1, end);
        
        return node;
    }

}