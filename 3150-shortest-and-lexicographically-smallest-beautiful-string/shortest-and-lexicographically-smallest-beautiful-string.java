class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int len = Integer.MAX_VALUE;
        int count = 0;
        char ch[] = s.toCharArray();
        for(int i = 0;i<s.length();i++){
           int j = i;
           while(j < s.length()){
            if(ch[j] == '1'){
                count++;
            }
            if(count == k){
                int sl = j-i+1;
                if(sl < len || sl==len && s.substring(i,j+1).compareTo(ans.toString()) < 0){
                    len = sl;
                    ans.setLength(0);
                    for(int x = i;x<=j;x++){
                        ans.append(ch[x]);
                    }
                    break;
                }
            }
            j++;
           }
           count = 0;

           
             
        }
        return ans.toString();
    }
}