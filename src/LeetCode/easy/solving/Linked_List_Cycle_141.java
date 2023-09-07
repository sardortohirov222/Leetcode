package LeetCode.easy.solving;

/**
 * Date-9/3/2023
 * Time-10:55 PM
 */
public class Linked_List_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode x1 = head, x2 = head;
        while (x2 != null && x2.next != null) {
            x1 = x1.next;
            x2 = x2.next.next;
            if (x1 == x2) return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x, ListNode node) {
        val = x;
        next = node;
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}