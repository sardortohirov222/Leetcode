package LeetCode.easy.todo.mergetwobinarytrees;

public class Merge_Two_Binary_Trees {
    public static void main(String[] args) {

        System.out.println(mergeTrees(new TreeNode(8), new TreeNode(21)));

    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            return new TreeNode(root1.val + root2.val, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right));
        } else if (root1 == null && root2 != null) {
            return root2;
        } else {
            return root1;
        }
    }

}
