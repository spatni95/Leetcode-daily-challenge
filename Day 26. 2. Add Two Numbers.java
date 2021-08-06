class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode dummy = new ListNode(0);
        ListNode add = dummy;
        while(l1 != null || l2 != null){
            if(l1 == null) sum = l2.val;
            else if(l2 == null) sum = l1.val;
            else sum = l1.val + l2.val;
            if((carry + sum) > 9){
                add.next = new ListNode((sum + carry) % 10);
                carry = 1;
            }else{
                add.next = new ListNode(sum + carry);
                carry = 0;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            add = add.next;
        }
        if(carry > 0){
            add.next = new ListNode(carry);
        }
        return dummy.next;        
    }
}