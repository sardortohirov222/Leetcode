package LeetCode.easy.solved;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Date-8/28/2023
 * Time-1:40 AM
 */
public class Implement_Stack_using_Queues_225 {
}

class MyStack {
    ArrayDeque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int i =top();
        queue.removeLast();
        return i;
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}