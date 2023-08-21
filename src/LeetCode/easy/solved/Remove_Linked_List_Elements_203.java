package LeetCode.easy.solved;

/**
 * Date-8/19/2023
 * Time-12:08 AM
 */
public class Remove_Linked_List_Elements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        while (temp!=null&&temp.next!=null){
            if (temp.next.val== val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        if (head!=null&&head.val==val)return head.next;
        return head;
    }
}
