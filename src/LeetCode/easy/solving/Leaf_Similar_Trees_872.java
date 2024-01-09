package LeetCode.easy.solving;

import java.util.*;

/**
 * Date-1/9/2024
 * By Sardor Tokhirov
 * Time-4:02 AM (GMT+5)
 */
//sorry future sardor i am too lazy to optimize it, you know it is easy pizi
public class Leaf_Similar_Trees_872 {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        // Create the second tree
        TreeNode tree2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7, new TreeNode(4), new TreeNode(2))), new TreeNode(1, null, new TreeNode(9, new TreeNode(8), null)));

        System.out.println(new Leaf_Similar_Trees_872().leafSimilar(tree1, tree2));
    }

    List<Integer> set1 = new ArrayList<>();
    List<Integer> set2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        num1(root1);
        num2(root2);
        if (set1.size()!=set2.size())return false;
        for (int i = 0; i <set1.size() ; i++) {
            if (set1.get(i)!=set2.get(i))return false;
        }
        return true;
    }

    public void num1(TreeNode root) {
        if (root != null && (root.left != null || root.right != null)) {
            num1(root.left);
            num1(root.right);
        }else  if (root != null) {
            set1.add(root.val);
        }
    }
    public void num2(TreeNode root) {
        if (root != null && (root.left != null || root.right != null)) {
            num2(root.left);
            num2(root.right);
        }else  if (root != null) {
            set2.add(root.val);
        }
    }
}
