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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        // Your code goes here
        if(head == null){
            return null;
        }
        ListNode current = head;

while (current != null) {

    ListNode prev = current;
    ListNode temp = current.next;

    while (temp != null) {

        if (current.val == temp.val) {
            prev.next = temp.next;
            temp = prev.next;
        } else {
            prev = temp;
            temp = temp.next;
        }
    }

    current = current.next;
}

return head;
    }
}