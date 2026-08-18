class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
          
        }
        while(pq.size() > 1){
            int s1 = pq.remove();
            int s2 = pq.remove();
            if(s1 != s2){
               int sol = s1-s2;
               pq.add(sol);
            }

         }
         return pq.isEmpty() ? 0 : pq.peek();

    }

}