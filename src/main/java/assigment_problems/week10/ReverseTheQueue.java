
package assigment_problems.week10;

public class ReverseTheQueue {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list
    static Node reverse(Node head) {

        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            // Store the next node
            next = current.next;

            // Reverse the link
            current.next = previous;

            // Move previous forward
            previous = current;

            // Move current forward
            current = next;
        }

        return previous;
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

        // Create original queue
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Queue:");
        display(head);

        // Reverse the queue
        head = reverse(head);

        System.out.println("Reversed Queue:");
        display(head);
    }
}

