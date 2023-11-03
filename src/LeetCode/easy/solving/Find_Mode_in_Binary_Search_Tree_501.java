package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Date-10/31/2023
 * By Sardor Tokhirov
 * Time-10:48 PM (GMT+5)
 */
public class Find_Mode_in_Binary_Search_Tree_501 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
        System.out.println(new Find_Mode_in_Binary_Search_Tree_501().findMode(root));
    }

    ArrayList<Integer> list = new ArrayList();

    public int[] findMode(TreeNode root) {
        addToArrayList(root);
        Collections.sort(list);
        Set<Integer> numSet = new HashSet<>();
        int i = 1, numMax = 1, numDef = 1, currentNum = list.get(0);
        numSet.add(currentNum);
        while (i < list.size()) {
            int nC = list.get(i);
            if (currentNum == nC) {
                numDef++;
                if (numDef >= numMax) {
                    if (numDef > numMax) {
                        numSet = new HashSet<>();
                    }
                    numSet.add(nC);
                    numMax = numDef;
                }
            } else {
                numDef = 1;
                currentNum=nC;
                if (numDef == numMax) {
                    numSet.add(nC);
                }
            }
            i++;
        }
        int[] result = new int[numSet.size()];
        int index = 0;
        for (int num : numSet) {
            result[index++] = num;
        }
        return result;
    }

    public void addToArrayList(TreeNode node) {
        if (node != null) {
            list.add(node.val);
            addToArrayList(node.left);
            addToArrayList(node.right);
        }
    }
}
