package LeetCode.easy.cheat_sheet.todo.reverse_linked_lst;

public class Reverse_Linked_List {
    public static void main(String[] args) {

        Reverse_Linked_List reverse_linked_list = new Reverse_Linked_List();
        System.out.println(reverse_linked_list.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
