package LeetCode.easy.solving.node;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer_1290 {
    public int getDecimalValue(ListNode head) {
        String a="";
        while(head!=null){
            a+=head.val;
            head=head.next;
        }
        return Integer.parseInt(a,2);
    }
}