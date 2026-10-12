class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    static TreeNode target;
    static HashMap<TreeNode,TreeNode> parent;
    public int amountOfTime(TreeNode root, int start) {
        target = null;
        parent = new HashMap<>();
        dfs(root,start);
        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> burned = new HashSet<>();
        int ans = 0;
        q.add(new Pair(target,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int level = front.level;
            ans = Math.max(ans,level);
            TreeNode node = front.node;
            burned.add(node);
            if(node.left != null && !burned.contains(node.left)){
                q.add(new Pair(node.left,level+1));
                burned.add(node.left);
            }
            if(node.right != null && !burned.contains(node.right)){
                q.add(new Pair(node.right,level+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),level+1));
                burned.add(parent.get(node));
            }

        }
        return ans;
    }
    public static void dfs(TreeNode root,int start){
        if(root == null)return;
        if(root.val == start)target = root;
        if(root.left != null)parent.put(root.left,root);
        if(root.right != null)parent.put(root.right,root);
        dfs(root.left,start);
        dfs(root.right,start);
    }
}