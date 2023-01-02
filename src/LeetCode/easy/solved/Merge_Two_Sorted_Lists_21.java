package LeetCode.easy.solved;

import LeetCode.easy.solved.ListNode;

import java.util.ArrayList;

/**
 * Date-12/29/2022
 * Time-9:39 AM
 */
public class Merge_Two_Sorted_Lists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<Integer> sortedList=new ArrayList<>();
        ListNode sotedNode=null;
        while (l1!=null||l2!=null){
            if (l1!=null&&l2!=null){
                if(l1.val<=l2.val){
                    sortedList.add(l1.val);
                    l1=l1.next;
                }else {
                    sortedList.add(l2.val);
                    l2=l2.next;
                }
            }
            if(l1==null){
                sortedList.add(l2.val);
                l2=l2.next;
            }else if(l2==null){
                sortedList.add(l1.val);
                l1=l1.next;
            }
        }
        int i=sortedList.size()-1;
        while (i!=-1){
            sotedNode=new ListNode(sortedList.get(i),sotedNode);
            i--;
        }

        return sotedNode;
    }

}

