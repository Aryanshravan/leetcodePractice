
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if(root == null )return 0;
        if(root.val < low) return rangeSumBST(root.right,low,high);
        else if(root.val > high) return rangeSumBST(root.left,low,high);
        else{
            sum += root.val +rangeSumBST(root.right,low,high)+rangeSumBST(root.left,low,high);
            return sum;
        }

    }
}