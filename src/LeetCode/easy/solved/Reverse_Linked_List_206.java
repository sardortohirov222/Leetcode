package LeetCode.easy.solved;

/**
 * Date-12/30/2022
 * Time-11:13 AM
 */
public class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        ListNode node=null;
        while (head!=null){
            node=new ListNode(head.val,node);
            head=head.next;
        }
        return node;
    }
}
