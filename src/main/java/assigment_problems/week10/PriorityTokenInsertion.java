
package assigment_problems.week10;

public class PriorityTokenInsertion {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    void addFirst(int token) {
        Node newNode = new Node(token);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void addLast(int token) {
        Node newNode = new Node(token);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Insert at a given index
    void insertAt(int index, int token) {

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addFirst(token);
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(token);

        newNode.next = current.next;
        current.next = newNode;
    }

    // Display linked list
    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        PriorityTokenInsertion list = new PriorityTokenInsertion();

        // Starting list
        list.addLast(101);
        list.addLast(102);
        list.addLast(103);

        // Operations
        list.addFirst(100);
        list.addLast(104);
        list.insertAt(2, 150);

        // Final list
        System.out.println("Final Linked List:");
        list.display();
    }
}

