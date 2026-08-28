package oops.assigment_problems;

public class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Copies Available: " + copiesAvailable);
        System.out.println();
    }

    public static void main(String[] args) {

        BookInventory[] books = new BookInventory[4];

        books[0] = new BookInventory("Java Programming", "James Gosling", 5);
        books[1] = new BookInventory("Clean Code", "Robert Martin", 3);
        books[2] = new BookInventory("Effective Java", "Joshua Bloch", 4);
        books[3] = new BookInventory("Head First Java", "Kathy Sierra", 2);

        for (BookInventory book : books) {
            book.printEntry();
        }
    }
}