package LinkedList;

class Node {

    int data;
    Node prev;
    Node next;

    Node(int d) {
       data = d;
       prev = next = null;      
    }
    
};

public class Doubly {

    static void forwardTraversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node insertAtFront(Node head, int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    public static Node insertEnd(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
        }
        return head;
    }

    static Node insertAtPos(Node head, int pos, int new_data) {
        Node new_node = new Node(new_data);
        if (pos == 1) {
            new_node.next = head;
            if (head != null)
                head.prev = new_node;
            head = new_node;
            return head;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; ++i) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        new_node.prev = curr;
        new_node.next = curr.next;
        curr.next = new_node;
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
        return head;
    }

    public static Node delHead(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    public static Node delLast(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        if (curr.prev != null) {
            curr.prev.next = null;
        }
        return head;
    }

    public static Node delPos(Node head, int x) {
        if (head == null){
            return head; 
        }
        Node curr = head;
        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }
        if (curr == null){
            return head; 
        }
        if (curr.prev != null)
            curr.prev.next = curr.next;
        if (curr.next != null)
            curr.next.prev = curr.prev;
        if (head == curr)
            head = curr.next;
        curr = null; 
        return head;
    }

    public static void main(String[] args) {

    }

}
