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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        ListNode head = new ListNode();
        ListNode tail = head;
        while(temp1!=null && temp2!=null ){
            int x = temp1.val;
            int y = temp2.val;
            int z = x + y + carry;
            int f = z % 10;
            carry = z/10;
            ListNode nn = new ListNode(f);
            temp1 = temp1.next;
            temp2 = temp2.next;
            tail.next = nn;
            tail = nn;

        }
        while(temp1!=null){
            int x = temp1.val;
            int z = x + carry;
            carry = z/10;
            int f = z%10;
            ListNode nn = new ListNode(f);
            temp1 = temp1.next;
            tail.next = nn;
            tail = nn;            
        }
        while(temp2!=null){
            int x = temp2.val;
            int z = x + carry;
            carry = z/10;
            int f = z%10;
            ListNode nn = new ListNode(f);
            temp2 = temp2.next;
            tail.next = nn;
            tail = nn;
       }
       if(carry!=0){
        ListNode nn = new ListNode(carry);
        tail.next = nn;
        tail = nn;
       }

       return head.next;
        
    }
}