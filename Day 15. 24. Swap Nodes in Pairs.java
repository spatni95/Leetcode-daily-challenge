/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode swap = head;
        ListNode x = dummy;
        
        while(swap != null && swap.next != null){
            ListNode q = swap.next, r = swap.next.next;
            x.next = q;
            q.next = swap;
            swap.next = r;
            x = swap;
            swap = r;
            
        }
        return dummy.next;   
    }
}
