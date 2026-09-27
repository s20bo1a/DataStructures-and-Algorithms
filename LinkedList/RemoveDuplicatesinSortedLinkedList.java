class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        if(head==null){
            return null;
        }

        while(current.next!=null){

            if(current.data == current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }

        }
        return head;
    }
}