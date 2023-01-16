package LeetCode.easy.solved.node;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-1/16/2023
 * Time-8:59 AM
 */
public class N_ary_Tree_Preorder_Traversal_589 {
    List<Integer> ordList = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root != null) {
            ordList.add(root.val);
            setOrdList(root.children);
        }
        return ordList;
    }

    public void setOrdList(List<Node> nodes) {
        for (int i = 0; i < nodes.size(); i++) {
            ordList.add(nodes.get(i).val);
            if (nodes.get(i).children != null) {
                setOrdList(nodes.get(i).children);
            }
        }
    }
}
