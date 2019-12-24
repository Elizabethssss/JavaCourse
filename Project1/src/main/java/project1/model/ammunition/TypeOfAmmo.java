package project1.model.ammunition;

public enum TypeOfAmmo {
    HELMET(3),
    TOP(20),
    BOTTOM(17),
    BOOTS(6),
    WEAPON(7),
    SHIELD(12);

    private int numOfPieces;

    public int getNumOfPieces() {
        return numOfPieces;
    }

    TypeOfAmmo(int numOfPieces) {
        this.numOfPieces = numOfPieces;
    }
}
