
class Solution {
    //test
    public TreeNode buildTree(int[] pre, int[] in) {
       int n = pre.length;
       return build(0,n-1,0,n-1,pre,in);
        
    }
    public TreeNode build(int prelow,int preh,int inl,int inh,int[] pre,int[] in){
        if(prelow > preh ||inl > inh)return null;
        int val = pre[prelow];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i =0;i<in.length;i++){
            if(in[i]==val){
                r = i;
                break;
            }
        }
        int count =  r - inl;
        root.left = build(prelow+1,prelow+count,inl,r-1,pre,in);
        root.right = build(prelow+1+count,preh,r+1,inh,pre,in);
        return root;
    }
}