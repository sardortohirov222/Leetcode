package LeetCode.easy.solved;

import LeetCode.easy.solved.ListNode;

/**
 * Date-12/30/2022
 * Time-11:23 AM
 */
public class Middle_of_the_Linked_List_876 {
    public ListNode middleNode(ListNode head) {
        int j = 0, i = 0;
        ListNode node = head;
        while (head != null) {
            i++;
            head = head.next;
        }
        while (j != i / 2) {
            node = node.next;
            j++;
        }
        return node;
    }
}
