package LeetCode.medium.cheat_sheet;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l1_brother = l1, l2_brother = l2, l3_twin = l3;
        int add_me = 0;
        while (l1_brother != null || l2_brother != null) {
            int a = l1_brother != null ? l1_brother.val : 0;
            int b = l1_brother != null ? l2_brother.val : 0;
            int sum = a + b + add_me;
            add_me = sum / 2;
            l3_twin.next = new ListNode(sum % 10);
            if (l1_brother != null) l1_brother = l1_brother.next;
            if (l2_brother != null) l2_brother = l2_brother.next;
        }
        if (add_me > 0) {
            l3_twin.next = new ListNode(add_me);
        }

        return l3.next;
    }


}


/**
 * public LeetCode.medium.cheat_sheet.ListNode addTwoNumbers(LeetCode.medium.cheat_sheet.ListNode l1, LeetCode.medium.cheat_sheet.ListNode l2) {
 * LeetCode.medium.cheat_sheet.ListNode dummyHead = new LeetCode.medium.cheat_sheet.ListNode(0);
 * LeetCode.medium.cheat_sheet.ListNode p = l1, q = l2, curr = dummyHead;
 * int carry = 0;
 * while (p != null || q != null) {
 * int x = (p != null) ? p.val : 0;
 * int y = (q != null) ? q.val : 0;
 * int sum = carry + x + y;
 * carry = sum / 10;
 * curr.next = new LeetCode.medium.cheat_sheet.ListNode(sum % 10);
 * curr = curr.next;
 * if (p != null) p = p.next;
 * if (q != null) q = q.next;
 * }
 * if (carry > 0) {
 * curr.next = new LeetCode.medium.cheat_sheet.ListNode(carry);
 * }
 * return dummyHead.next;
 * }
 */