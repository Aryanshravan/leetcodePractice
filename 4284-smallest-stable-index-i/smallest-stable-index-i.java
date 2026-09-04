class Solution {
    public int firstStableIndex(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

        
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, arr[j]);
            }

            
            for (int k = i; k < n; k++) {
                min = Math.min(min, arr[k]);
            }

            if (max - min <= x) {
                return i;   
            }
        }

        return -1;
    }
}