package project1.model.ammunition;

public class Ammunition {
    private String name;
    private double price;
    private double weight;
    private Material material;
    private TypeOfAmmo typeOfAmmo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Ammunition(String name, double price, Material material, TypeOfAmmo typeOfAmmo) {
        this.name = name;
        this.price = price;
        this.weight = Math.round(typeOfAmmo.getNumOfPieces() * material.getDensity());
        this.material = material;
        this.typeOfAmmo = typeOfAmmo;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : name = " + name + ", price = " + price + ", weight = " + weight +
                ", material = " + material.name() + ", typeOfAmmo = " + typeOfAmmo;
    }
}
