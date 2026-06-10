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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode revHead = null;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next = revHead;
            revHead = curr;
            curr = temp;
        }
        ListNode temp = head;
        while(revHead!=null){
        ListNode next1 = temp.next;
        ListNode next2 = revHead.next;
        temp.next = revHead;
        revHead.next = next1;
        temp = next1;
        revHead = next2;
        }
        
    }
}