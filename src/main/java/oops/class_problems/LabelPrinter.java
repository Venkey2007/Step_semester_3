package oops.class_problems;

public class LabelPrinter {

    public static void printAll(Printable[] items) {

        for (Printable item : items) {
            System.out.println(item.printLabel());
        }
    }
}