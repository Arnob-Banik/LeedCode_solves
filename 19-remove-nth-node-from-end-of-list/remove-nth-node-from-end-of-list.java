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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        if(n==size){
            head = head.next;
        }
        else if(n==1){
            ListNode pred = getNode(head, size-1);
            pred.next =null;

        }
        else{
            ListNode pred = getNode(head, size-n);
            ListNode rem = pred.next;
            ListNode suc = rem.next;
            pred.next = suc;
            rem.next = null;
            rem=null;
        }
        return head;
    }
    public int getSize(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode getNode(ListNode head, int n){
        int count = 1;
        ListNode temp = head;
        while(count != n){
            temp = temp.next;
            count++;
        }
        return temp;
    }
}