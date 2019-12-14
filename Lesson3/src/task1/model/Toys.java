package task1.model;

public class Toys {
    private String country;
    private int price;
    private String material;

    public Toys(String country, int price, String material) {
        this.country = country;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : country = " + country + ", material = "
                + material + ", price = " + price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
