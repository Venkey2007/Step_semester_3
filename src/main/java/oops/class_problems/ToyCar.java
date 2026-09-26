package oops.class_problems;

public class ToyCar extends Toy {

    private String name;

    public ToyCar(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return name + ": Vroom vroom!";
    }
}