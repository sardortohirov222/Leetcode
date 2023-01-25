package LeetCode.easy.solved.tree_node;

/**
 * Date-1/25/2023
 * Time-8:53 AM
 */
public class Balanced_Binary_Tree_110 {
    public static void main(String[] args) {
        var a = new Balanced_Binary_Tree_110();
        System.out.println(a.isBalanced(new TreeNode(1)));
    }


    boolean ans = true;

    public int solve(TreeNode root) {
        if (root == null)
            return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if (Math.abs(left - right) > 1)
            ans = false;
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        solve(root);
        return ans;
    }

}
