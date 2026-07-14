package LinkedList;

class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

public class Circular {
    
    static Node insertAtBeginning(Node last, int key) {
        Node newNode = new Node(key);
        if (last == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    public static Node insertAtEnd(Node tail, int key) {
        Node newNode = new Node(key);
        if (tail == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        return newNode;
    }

    public static Node insertAtPosition(Node last, int data, int pos) {
        if (last == null) {
            if (pos != 1) {
                System.out.println("Invalid position!");
                return last;
            }
            Node newNode = new Node(data);
            last = newNode;
            last.next = last;
            return last;
        }
        Node newNode = new Node(data);
        Node curr = last.next;
        if (pos == 1) {
            newNode.next = curr;
            last.next = newNode;
            return last;
        }
        for (int i = 1; i < pos - 1; ++i) {
            curr = curr.next;
            if (curr == last) {
                System.out.println("Invalid position!");
                return last;
            }
        }
        newNode.next = curr.next;
        curr.next = newNode;
        if (curr == last) {
            last = newNode;
        }
        return last;
    }

    public static Node deleteFirstNode(Node last) {
        if (last == null) {
            System.out.println("List is empty");
            return null;
        }
        Node head = last.next;
        if (head == last) {
            last = null;
        } else {
            last.next = head.next;
        }
        return last;
    }

    public static Node deleteSpecificNode(Node last, int key){
        if (last == null) {
            return null;
        }
        Node curr = last.next;
        Node prev = last;
        if (curr == last && curr.data == key) {
            last = null;
            return last;
        }
        if (curr.data == key) {
            last.next = curr.next;
            return last;
        }
        while (curr != last && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr.data == key) {
            prev.next = curr.next;
            if (curr == last) {
                last = prev;
            }
        }
        return last;
    }

    public static Node deleteLastNode(Node last){
        if (last == null) {
            return null;
        }
        Node head = last.next;
        if (head == last) {
            last = null;
            return last;
        }
        Node curr = head;
        while (curr.next != last) {
            curr = curr.next;
        }
        curr.next = head;
        last = curr;
        return last;
    }

}
