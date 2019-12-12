package model;

import java.util.ArrayList;

public class Playroom {
    ArrayList<Toys> toys = new ArrayList<>();

    public Playroom() {
        toys.add(new Car("Ukraine", 899, "plastic", "blue"));
        toys.add(new Car("China", 1999, "plastic", "red"));
        toys.add(new Car("Russia", 435, "wood", "brown"));
        toys.add(new Barbie("China", 1300, "plastic", "pink", "blond"));
        toys.add(new Barbie("China", 1699, "plastic", "multicolor", "black"));
        toys.add(new Barbie("India", 999, "plastic", "yellow", "brunette"));
        toys.add(new Barbie("America", 2500, "eco-plastic", "blue", "red"));
        toys.add(new SoftToy("Romania", 199, "cotton"));
        toys.add(new SoftToy("Ukraine", 799, "wool"));
        toys.add(new SoftToy("Ukraine", 1199, "eco-cotton"));
        toys.add(new Constructor("China", 599, "plastic", 250));
        toys.add(new Constructor("Russia", 2599, "wood", 750));
        toys.add(new Constructor("Russia", 1599, "plastic", 400));
        toys.add(new TransformerCar("China", 599, "plastic", "yellow", 2));
        toys.add(new TransformerCar("America", 879, "plastic", "orange", 3));
        toys.add(new TransformerCar("America", 1099, "metal", "black", 4));
    }
}
