package LeetCode.easy.solving;

/**
 * Date-8/20/2023
 * Time-4:56 AM
 */
public class Search_in_a_Binary_Search_Tree_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode left = null;
        TreeNode right = null;
        if (root.val == val) return root;
        if (root.left != null) {
            left = searchBST(root.left, val);
            if (left != null) return left;
        }
        if (root.right != null) {
            right = searchBST(root.right, val);
            if (right != null) return right;
        }
        return null;
    }

}
