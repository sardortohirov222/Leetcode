package LeetCode.medium.solved;

/**
 * Date-9/7/2023
 * Time-2:04 AM
 */
public class Reverse_Linked_List_II_92 {
    public static void main(String[] args) {
        System.out.println(new Reverse_Linked_List_II_92().reverseBetween( new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),2,4));
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node1=head;
        for (int i = 0; i <left-1 ; i++) {
        node1=node1.next;
        }
        ListNode node2=node1;
        int[] num=new int[right-left+1];
        for (int i =num.length-1 ; i >=0; i--) {
            num[i]=node1.val;
            node1=node1.next;
        }
        for (int i = 0; i <=num.length-1 ; i++) {
            node2.val=num[i];
            node2=node2.next;
        }

        return head;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
