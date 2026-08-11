
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        avg(root,list);
        return list;
    }
    public void avg(TreeNode root,List<Double> list){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        double sum = 0;
            double count = 0;
        while(q.size()>0){
            
            TreeNode front = q.remove();
            if(front == null){
                double ans = sum /count;
                list.add(ans);
                sum = 0;
                count = 0;
                if(q.size()>0){
                    q.add(null);
                }
            }else{
                sum+= front.val;
                count++;
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
        }
    }
}