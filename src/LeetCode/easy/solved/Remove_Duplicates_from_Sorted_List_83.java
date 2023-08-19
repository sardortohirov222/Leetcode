package LeetCode.easy.solved;


/**
 * Date-8/18/2023
 * Time-11:19 PM
 */
public class Remove_Duplicates_from_Sorted_List_83 {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null){
            if (temp.next!=null&&temp.val== temp.next.val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return head;
    }

}

