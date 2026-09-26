package oops.assigment_problems;

public class Sculpture extends ArtPiece {

    private String title;

    public Sculpture(String title) {
        this.title = title;
    }

    @Override
    public String describe() {
        return "Sculpture: " + title + ", carved from stone";
    }
}