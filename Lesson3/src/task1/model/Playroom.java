package task1.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Playroom {
    ArrayList<Toys> toys = new ArrayList<>();
    ArrayList<Toys> typeToys;

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

    public ArrayList<Toys> getToys() {
        return toys;
    }

    public ArrayList<Toys> getTypeToys() {
        return typeToys;
    }

    public double getAllSum() {
        double result = 0;
        for (Toys toy : toys)
            result += toy.getPrice();
        return result;
    }

    public void sortBy(String str) {
        typeToys = new ArrayList<>();
        switch (str) {
            case "country":
                toys.sort(Comparator.comparing(Toys::getCountry));
                break;
            case "material":
                toys.sort(Comparator.comparing(Toys::getMaterial));
                break;
            case "price":
                toys.sort(Comparator.comparing(Toys::getPrice));
                break;
            case "hairColor":
                for (Toys toy : toys)
                    if (toy instanceof Barbie)
                        typeToys.add(toy);
                typeToys.sort(Comparator.comparing(o -> ((Barbie) o).getHairColor()));
                break;
            case "dressColor":
                for (Toys toy : toys)
                    if (toy instanceof Barbie)
                        typeToys.add(toy);
                typeToys.sort(Comparator.comparing(o -> ((Barbie) o).getDressColor()));
                break;
            case "numOfElements":
                for (Toys toy : toys)
                    if (toy instanceof Constructor)
                        typeToys.add(toy);
                typeToys.sort(Comparator.comparing(o -> ((Constructor) o).getNumOfElements()));
                break;
            case "numOfStates":
                for (Toys toy : toys)
                    if (toy instanceof TransformerCar)
                        typeToys.add(toy);
                typeToys.sort(Comparator.comparing(o -> ((TransformerCar) o).getNumOfStates()));
                break;
            case "color":
                for (Toys toy : toys)
                    if (toy instanceof Car)
                        typeToys.add(toy);
                typeToys.sort(Comparator.comparing(o -> ((Car) o).getColor()));
                break;
        }
    }
}
