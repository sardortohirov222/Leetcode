import LeetCode.medium.solving.node_98.TreeNode;
import LeetCode.medium.solving.node_98.Validate_Binary_Search_Tree_98;

public class Sardor {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        var a = new Validate_Binary_Search_Tree_98();
        System.out.println(a.isValidBST(new TreeNode(5,new TreeNode(4),new TreeNode(6,new TreeNode(3),new TreeNode(7)))));
    }
}
