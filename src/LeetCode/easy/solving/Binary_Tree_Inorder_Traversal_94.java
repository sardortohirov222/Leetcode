package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-8/16/2023
 * Time-11:42 PM
 */
public class Binary_Tree_Inorder_Traversal_94 {
    //1,9,3,3,2,6
    //1,5,3,6,2,7,4,8
    List<Integer> integerList=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root!=null){
            integerList.add(root.val);
        }
        left(root.left);
        right(root.right);
        return integerList;
    }
    public void left(TreeNode leftNode){
        if (leftNode==null)return;
        integerList.add(leftNode.val);
        left(leftNode.left);
        right(leftNode.right);
    }
    public void right(TreeNode rightNode){
        if (rightNode==null)return;
        integerList.add(rightNode.val);
        left(rightNode.left);
        right(rightNode.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
