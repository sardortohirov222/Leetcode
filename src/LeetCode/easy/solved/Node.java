package LeetCode.easy.solved;

/**
 * Date-1/3/2023
 * Time-10:05 AM
 */

import java.util.List;

public class  Node {
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
};