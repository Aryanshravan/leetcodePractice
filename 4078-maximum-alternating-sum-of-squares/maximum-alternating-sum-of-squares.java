class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long square[] = new long[n];
        long sum = 0;
        for(int i = 0;i<n;i++){
            square[i] = arr[i]*arr[i];
        }
        Arrays.sort(square);
        for(int i = 0;i<n;i++){
            if(i < n/2){
                sum -= square[i];
            }
            else{
                sum += square[i];
            }
        }
        return sum;
    }
}