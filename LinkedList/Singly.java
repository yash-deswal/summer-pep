package LinkedList;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }

    static void insertAtEnd(Node head, int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node newNode = new Node(val);
        curr.next = newNode;
    }

    static void insertAtFront(Node head, int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    static void insertAtPos(Node head, int pos, int val) {
        if (pos < 1) return;
        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) return;
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    static Node deleteHead(Node head) {
        if (head == null) return null;
        head = head.next;
        return head;
    }

    static Node removeLastNode(Node head) {
        if (head == null || head.next == null) return null;
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return head;
    }

    static Node deleteNode(Node head, int position) {
        Node temp = head;
        if (position == 1) {
            head = temp.next;
            return head;
        }
        Node prev = null;
        for (int i = 1; i < position; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
    
    static boolean searchKey(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    static Node reverseList(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class Singly {

    public static void main(String[] args) {
        
    }
}
