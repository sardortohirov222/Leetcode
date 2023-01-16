package LeetCode.easy.solved.node;

import java.util.List;

/**
 * Date-1/16/2023
 * Time-9:06 AM
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
