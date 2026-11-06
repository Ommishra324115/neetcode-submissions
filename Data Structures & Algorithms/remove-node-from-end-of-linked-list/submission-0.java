class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head ; 
        int len = 0  ; 
        while (curr != null){
            len++ ; 
            curr = curr.next ; 
        }
              if(n == len){
            return head.next;
        }

        curr = head ; 
        for(int i=0;i<(len-n-1) ;i++){
            curr = curr.next ; 
        }
        curr.next = curr.next.next ; 

        return head ; 
    }
}