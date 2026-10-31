
package assigment_problems.week10;

public class TrainCoachesBothWays {

    // Node class for doubly linked list
    static class Node {
        String name;
        Node prev;
        Node next;

        Node(String name) {
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Add coach at the end
    void addLast(String name) {

        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove coach by name
    void remove(String name) {

        Node current = head;

        // Find the coach
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }

        // Coach not found
        if (current == null) {
            System.out.println("Coach not found: " + name);
            return;
        }

        // If coach is the first node
        if (current == head) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }

        // If coach is the last node
        if (current == tail) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
    }

    // Print coaches from head to tail
    void printForward() {

        Node current = head;

        System.out.print("Forward: ");

        while (current != null) {
            System.out.print(current.name);

            if (current.next != null) {
                System.out.print(" <-> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    // Print coaches from tail to head
    void printBackward() {

        Node current = tail;

        System.out.print("Backward: ");

        while (current != null) {
            System.out.print(current.name);

            if (current.prev != null) {
                System.out.print(" <-> ");
            }

            current = current.prev;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        TrainCoachesBothWays train = new TrainCoachesBothWays();

        // Add coaches
        train.addLast("Engine");
        train.addLast("A1");
        train.addLast("B1");
        train.addLast("B2");
        train.addLast("Guard");

        // Remove coach B1
        train.remove("B1");

        // Display train in both directions
        train.printForward();
        train.printBackward();
    }
}

