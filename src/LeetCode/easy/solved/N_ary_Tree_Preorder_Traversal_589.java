package LeetCode.easy.solved;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-1/3/2023
 * Time-10:04 AM
 */
public class N_ary_Tree_Preorder_Traversal_589 {
    List<Integer> integerList = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root != null) {
            integerList.add(root.val);
            if (root.children != null) {
                despacito(root.children);
            }
        }
        return integerList;
    }

    public void despacito(List<Node> nodeList) {
        int full = 0;
        while (nodeList.size() > full) {
            integerList.add(nodeList.get(full).val);
            if (nodeList.get(full).children != null) {
                despacito(nodeList.get(full).children);
            }
            full++;

        }

    }

}
