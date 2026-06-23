package Java;

import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class Classes {
    public static void main(String[] args) {
        Node node = new Node(10);
        System.out.println(node.data);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.removeLast();
        list.clear();
    }
}
