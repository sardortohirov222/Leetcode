package LeetCode.easy.solved;

/**
 * Date-1/8/2024
 * By Sardor Tokhirov
 * Time-11:06 AM (GMT+5)
 */
public class Range_Sum_of_BST_938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root != null) {
            if (root.val <= high && root.val >= low)
                return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high) + root.val;
            return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        return 0;
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
