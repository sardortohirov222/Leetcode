package LeetCode.medium.solved.node_102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date-1/7/2023
 * Time-10:56 AM
 */
public class Binary_Tree_Level_Order_Traversal_102 {

    private List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return list;
        }
        List<TreeNode> list1 = Arrays.asList(root);
        sorter(list1);
        return list;
    }

    public List<Integer> sorter(List<TreeNode> nodeList) {
        List<Integer> integerList = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < nodeList.size(); i++) {
            TreeNode treeNode = nodeList.get(i);
            if (treeNode.left != null) {
                nodes.add(treeNode.left);
            }
            if (treeNode.right != null) {
                nodes.add(treeNode.right);
            }
            integerList.add(treeNode.val);
        }
        list.add(integerList);

        return nodes.size() == 0 ? null : sorter(nodes);
    }

}
