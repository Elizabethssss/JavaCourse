package model;

public class Barbie extends Toys{
    private String dressColor;
    private String hairColor;

    public String getDressColor() {
        return dressColor;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", dressColor = " + dressColor + ", hairColor = " + hairColor;
    }

    public Barbie(String country, int price, String material, String dressColor, String hairColor) {
        super(country, price, material);
        this.dressColor = dressColor;
        this.hairColor = hairColor;
    }

}
