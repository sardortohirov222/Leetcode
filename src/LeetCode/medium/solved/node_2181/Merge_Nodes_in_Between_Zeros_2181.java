package LeetCode.medium.solved.node_2181;

/**
 * Date-3/22/2023
 * Time-5:19 AM
 */
public class Merge_Nodes_in_Between_Zeros_2181 {
        public ListNode mergeNodes(ListNode head) {
            ListNode dummy = new ListNode(Integer.MIN_VALUE), prev = dummy;
            while (head != null && head.next != null) {
                prev.next = head;
                head = head.next;
                while (head != null && head.val != 0) {
                    prev.next.val += head.val;
                    head = head.next;
                }
                prev = prev.next;
            }
            prev.next = null;
            return dummy.next;
        }


//    public ListNode mergeNodes(ListNode head) {
//        Queue<Integer> list=new LinkedList<>();
//        int sum = 0;
//        while (head!=null) {
//            if (head.val == 0&&sum!=0) {
//                list.add(sum);
//                sum= 0;
//            }
//            sum+=head.val;
//            head = head.next;
//        }
//        return retListNode(list);
//    }
//
//    public ListNode retListNode(Queue<Integer> stack){
//        if (stack.isEmpty()){
//            return null;
//        }
//
//        return new ListNode(stack.poll(),retListNode(stack));
//    }
}
