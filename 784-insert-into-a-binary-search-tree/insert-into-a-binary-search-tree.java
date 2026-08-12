
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
           TreeNode node = new TreeNode(val);
           return node;
        }
         
        insert(root,val);
        return root;
    }
    public void insert(TreeNode root,int val){
        if(root == null )return ;
        if(root.val < val){
            if(root.right == null){
                TreeNode node = new TreeNode(val);
                root.right = node;
            }else{
                insert(root.right,val);
            }
        }
        else {
            if(root.left == null){
                TreeNode node = new TreeNode(val);
                root.left = node;
            }else{
                insert(root.left,val);
            }
        }
    }
}