class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        HashSet set = new HashSet<>();
        Arrays.sort(arr);
        int l = arr[0];
        int h = arr[arr.length-1];
        for(int ele : arr){
            set.add(ele);
        }
        for(int i = l ;i<=h;i++){
            if(!set.contains(i))ans.add(i);
        }
        return ans;
    }
}