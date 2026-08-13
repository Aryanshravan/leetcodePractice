
class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        int sum = 0;
        for(int i = arr.size()-1;i>=0;i--){
            int val = arr.get(i).val;
            sum+=val;
            arr.get(i).val = sum;
            
        }
        return root;

    }
    public void inorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root == null )return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
        
    }

}