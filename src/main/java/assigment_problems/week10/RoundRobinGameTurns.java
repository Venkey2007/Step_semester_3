
package assigment_problems.week10;

import java.util.Scanner;

public class RoundRobinGameTurns {

    // Node class
    static class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    Node tail;

    // Add player at the end
    void addLast(String name) {

        Node newNode = new Node(name);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print players for the given number of turns
    void printTurns(int turns) {

        if (tail == null) {
            System.out.println("No players available");
            return;
        }

        Node current = tail.next;

        System.out.print("Players for each turn: ");

        for (int i = 0; i < turns; i++) {

            System.out.print(current.name);

            if (i < turns - 1) {
                System.out.print(" ");
            }

            current = current.next;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RoundRobinGameTurns game = new RoundRobinGameTurns();

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        sc.nextLine();

        // Read player names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            game.addLast(name);
        }

        // Read number of turns
        System.out.print("Enter number of turns: ");
        int turns = sc.nextInt();

        // Display turns
        game.printTurns(turns);

        sc.close();
    }
}

