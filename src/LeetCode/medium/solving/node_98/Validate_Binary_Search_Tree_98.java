package LeetCode.medium.solving.node_98;

/**
 * Date-1/8/2023
 * Time-9:20 AM
 */
public class Validate_Binary_Search_Tree_98 {
    public boolean isValidBST(TreeNode root) {
        return rightAndLeftSiteChecker(root, root.val);
    }

    public boolean rightAndLeftSiteChecker(TreeNode root,int hightValue) {
        boolean isValid = true;
        if (root.left != null && root.left.val >= root.val&& root.left.val >= hightValue) {
            return  false;
        } else if (root.left != null && root.left.val < root.val) {
            isValid = rightAndLeftSiteChecker(root.left,0);
        }
        if (root.right != null && root.right.val <= root.val && root.left.val >= hightValue) {
            return  false;
        } else if (root.right != null && root.right.val > root.val) {
            isValid = rightAndLeftSiteChecker(root.right,root.val);
        }
        return isValid;
    }
}