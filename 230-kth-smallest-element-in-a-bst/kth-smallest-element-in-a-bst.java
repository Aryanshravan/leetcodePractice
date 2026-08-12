
class Solution {

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int ans = 0;
        for(int i = 0;i<arr.size();i++){
            ans = arr.get(k-1);
        }
        return ans;

    }
    public void inorder(TreeNode root,ArrayList<Integer> arr ){
        
        if(root == null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}