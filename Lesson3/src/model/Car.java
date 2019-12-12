package model;

public class Car extends Toys {
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color = " + color;
    }

    public Car(String country, int price, String material, String color) {
        super(country, price, material);
        this.color = color;
    }
}
