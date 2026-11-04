/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        int length = 0;
        ListNode last = head;
        while (last.next != null) {
            length++;
            last = last.next;
        }

        ListNode temp = head;
        for (int i = 0; i < length / 2; i ++) {
            temp = temp.next;
        }

        reverse(temp);
        temp = head;
        for (int i = 0; i < (length + 1) / 2; i++) {
            ListNode temp1 = temp.next;
            ListNode temp2 = last.next;

            temp.next = last;
            last.next = temp1;

            last = temp2;
            temp = temp1;
        }

        return;
    }

    public ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode temp = reverse(head.next);
        temp.next = head;
        head.next = null;
        
        return head;
    }
}
