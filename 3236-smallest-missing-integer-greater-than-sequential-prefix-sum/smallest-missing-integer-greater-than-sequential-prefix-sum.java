class Solution {
    public int missingInteger(int[] arr) {
        int sum = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                sum += arr[i];
            }else{
                break;
            }
        }

        Arrays.sort(arr);

        for(int num : arr){
            if(num == sum){
                sum += 1;
            }
            else if(num> sum ){
                break;
            }
        }
        return sum;
       
       
    }
}