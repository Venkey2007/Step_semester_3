package oops.assigment_problems;

public abstract class ArtPiece {

    private static int pieceCount = 0;
    private final String pieceId;

    public ArtPiece() {
        pieceCount++;
        pieceId = "ART-" + (1000 + pieceCount);
    }

    public abstract String describe();

    public String getPieceId() {
        return pieceId;
    }
}