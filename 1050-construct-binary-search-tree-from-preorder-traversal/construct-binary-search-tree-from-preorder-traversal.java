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
    public TreeNode bstFromPreorder(int[] preorder) {
        return createBST(preorder, 0, preorder.length - 1);
    }
    private TreeNode createBST(int[] pre, int st, int end){
        if(st > end){
            return null;
        }
        TreeNode root = new TreeNode(pre[st]);
        int i = st + 1;
        while(i <= end && pre[i] < root.val){
            i++;
        }
        root.left = createBST(pre, st + 1, i - 1);
        root.right = createBST(pre, i, end);
        return root;
    }
}