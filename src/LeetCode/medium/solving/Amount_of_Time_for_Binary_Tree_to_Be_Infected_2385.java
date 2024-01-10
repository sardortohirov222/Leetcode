package LeetCode.medium.solving;

import LeetCode.easy.solved.tree_node.TreeNode;

/**
 * Date-1/10/2024
 * By Sardor Tokhirov
 * Time-6:11 AM (GMT+5)
 */
//fuck you all i hate this problem
public class Amount_of_Time_for_Binary_Tree_to_Be_Infected_2385 {
//    public static void main(String[] args) {
//        TreeNode tree = new TreeNode(1,
//                null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5))))
//        );

//        TreeNode tree = new TreeNode(3, new TreeNode(2), new TreeNode(1, null, new TreeNode(4)));
//        TreeNode tree = new TreeNode(55, new TreeNode(4), new TreeNode(3));
//        TreeNode tree = new TreeNode(2,
//                new TreeNode(13,
//                        null,
//                        new TreeNode(6,
//                                new TreeNode(9,
//                                        new TreeNode(19,
//                                                null,
//                                                new TreeNode(10,
//                                                        null,
//                                                        new TreeNode(12))),
//                                        new TreeNode(4)),
//                                new TreeNode(7))),
//                new TreeNode(3));


//                TreeNode tree = new TreeNode(5, new TreeNode(2,new TreeNode(4,new TreeNode(1)),null), new TreeNode(3));
//
//        System.out.println(new Amount_of_Time_for_Binary_Tree_to_Be_Infected_2385().amountOfTime(tree, 13));
//    }
//
//    int index = 0;
//    boolean left = false;
//
//    public int amountOfTime(TreeNode root, int start) {
//        if (root.left == null || root.right == null) {
//            int i = findIndexOfInfection(root, start, true);
//            if (i / 2 >= index) {
//                return i - index;
//            }
//            return index - 1;
//        }
//        int num1 = findIndexOfInfection(root.left, start, true);
//        int num2 = findIndexOfInfection(root.right, start, false);
//        if (root.val == start) {
//            return num1 > num2 ? num1 : num2;
//        }
//        if (left) {
//            if (num1 > num2) {
//                if (index>num2+(num1-index))
//                    return index-1;
//                return num1 - index;
//            }
//            return num1 - index + num2 + 1;
//        } else {
//
//            return num2 - index + num1 + 1;
//        }
//
//    }
//
//    public int findIndexOfInfection(TreeNode root, int start, boolean isLeft) {
//        if (root == null) {
//            return 0;
//        }
//        int num1 = findIndexOfInfection(root.left, start, isLeft) + 1;
//        int num2 = findIndexOfInfection(root.right, start, isLeft) + 1;
//
//        int num = num1 > num2 ? num1 : num2;
//        if (root.val == start) {
//            if (isLeft) {
//                left = true;
//            }
//            index = num;
//        }
//        return num;
//    }

}
