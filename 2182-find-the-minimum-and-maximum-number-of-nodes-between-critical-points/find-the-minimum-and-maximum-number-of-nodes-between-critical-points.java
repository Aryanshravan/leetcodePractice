class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int first = -1;
        int prevCritical = -1;
        int minDist = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        
        int idx = 1;

        while (curr != null && curr.next != null) {
            
            // Check if current node is a critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                if (first == -1) {
                    first = idx;
                } else {
                    // Minimum distance between consecutive critical points
                    minDist = Math.min(minDist, idx - prevCritical);
                }

                prevCritical = idx;
            }

            prev = curr;
            curr = curr.next;
            idx++;
        }

        // Less than 2 critical points
        if (first == -1 || first == prevCritical) {
            return new int[]{-1, -1};
        }

        // Maximum distance = last critical - first critical
        return new int[]{
            minDist,
            prevCritical - first
        };
    }
}