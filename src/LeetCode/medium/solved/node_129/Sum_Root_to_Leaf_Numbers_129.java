package LeetCode.medium.solved.node_129;

/**
 * Date-3/14/2023
 * Time-6:59 AM
 */
public class Sum_Root_to_Leaf_Numbers_129 {
    public static void main(String[] args) {
        System.out.println(new Sum_Root_to_Leaf_Numbers_129().sumNumbers(new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0))));
    }

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    public void helper(TreeNode root, int str) {
        if (root == null) {
            return;
        }
        str = str*10+root.val;

        if (root.left == null && root.right == null) {
            sum += str;
            return;
        }
        helper(root.left, str);
        helper(root.right, str);
    }

}
