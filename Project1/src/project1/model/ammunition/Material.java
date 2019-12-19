package project1.model.ammunition;

public enum Material {
    COTTON(0.6),
    LEATHER(1.6),
    WOOD(0.52),
    STONE(1.9),
    CHAIN_ARMOUR(2),
    GOLD(8.6),
    IRON(7.9),
    BRILLIANT(3.5);

    private double density;

    public double getDensity() {
        return density;
    }

    Material(double density) {
        this.density = density;
    }
}
