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
    int diff = Integer.MAX_VALUE;
    int pre = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        find(root);
        return diff;
    }
    private void find(TreeNode root) {
        if (root == null) {
            return;
        }
        find(root.left);
        diff = Math.min(diff, Math.abs(root.val - pre));
        pre = root.val;
        find(root.right);
    }
}