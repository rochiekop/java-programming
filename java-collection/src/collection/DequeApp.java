package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Eko");
        stack.offerLast("Rochi");
        stack.offerLast("Pambudi");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Eko");
        queue.offerLast("Rochi");
        queue.offerLast("Pambudi");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
