package LeetCode.easy.Middle_of_the_Linked_List;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.middleNode(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))))));

    }


    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            n++;
            temp = temp.next;
        }
        temp = head;
        int i=0;
        while(i!=(int)n/2)
        {
            temp=temp.next;
            i++;
        }
        return temp;
    }
//        public ListNode middleNode(ListNode head) {
//        ListNode node = null;
//            ArrayList list=new ArrayList();
//
//            while (head!=null){
//                list.add(head.val);;
//                head=head.next;
//            }
//            int as=list.size()/2;
//            while (as<list.size()){
//                if(node == null){
//                node=new ListNode();}
//                node.val=(Integer) list.get(as);
//                as++;
//            }
//
//        return node;
//        }

}
