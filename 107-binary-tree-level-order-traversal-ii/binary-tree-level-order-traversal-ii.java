
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        level(root,ans);
        Collections.reverse(ans);
        return ans;

    }
    public void level(TreeNode root,List<List<Integer>> ans){
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
         List<Integer> lvl = new ArrayList<>();
        while(q.size()>0){
          TreeNode front = q.remove();
          if(front == null){
            ans.add(lvl);
            lvl = new ArrayList<>();
            if(q.size()>0){
                q.add(null);
            }
          }else{
               lvl.add(front.val);
               
               if(front.left != null)q.add(front.left);
               if(front.right != null)q.add(front.right);
               
          }

        }
    }
}