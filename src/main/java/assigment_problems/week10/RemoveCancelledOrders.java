
package assigment_problems.week10;

public class RemoveCancelledOrders {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to remove all nodes with the given code
    static Node removeAll(Node head, int code) {

        // Remove matching nodes from the beginning
        while (head != null && head.data == code) {
            head = head.next;
        }

        // Remove matching nodes from the remaining list
        Node current = head;

        while (current != null && current.next != null) {

            if (current.next.data == code) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // Display linked list
    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Create starting list
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(5);

        // Order code to remove
        int code = 5;

        System.out.println("Original Orders:");
        display(head);

        // Remove cancelled orders
        head = removeAll(head, code);

        System.out.println("After Removing Cancelled Orders:");
        display(head);
    }
}

