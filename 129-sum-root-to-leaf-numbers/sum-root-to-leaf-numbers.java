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
    public int sumNumbers(TreeNode root) {
       return  ans(root,0);
    }
    public static int ans(TreeNode root,int n){
        if(root == null ){
            return 0;

        }
        n = n*10+root.val;
        if(root.left == null && root.right == null){
            return n;
        }
        return ans(root.left,n)+ans(root.right,n);
    }
}