package oops.class_problems;

public abstract class Toy {

    private static int toyCount = 0;
    private final String toyId;

    public Toy() {
        toyCount++;
        toyId = "TOY-" + (1000 + toyCount);
    }

    public abstract String makeSound();

    public String getToyId() {
        return toyId;
    }
}