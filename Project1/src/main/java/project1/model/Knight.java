package project1.model;

import project1.model.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Comparator;

public class Knight {
    ArrayList<Ammunition> kit;
    ArrayList<Ammunition> filteredKit;

    public Knight(ArrayList<Ammunition> kit) {
        this.kit = kit;
    }

    public Knight() {this.kit = new ArrayList<>(); }

    public ArrayList<Ammunition> getKit() {
        return kit;
    }

    public ArrayList<Ammunition> getFilteredKit() {
        return filteredKit;
    }

    // sum all prices of given kit
    public double sumAll() {
        double sum = 0;
        for (Ammunition ammunition : kit)
            sum += ammunition.getPrice();
        return sum;
    }

    // sorting kit by weight
    public void sortByWeight() {
        kit.sort(new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition o1, Ammunition o2) {
                return (int) ((int) o1.getWeight() - o2.getWeight());
            }
        });
    }

    // sorting kit by price
    public void sortByPrice() {
        kit.sort(new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition o1, Ammunition o2) {
                return (int) ((int) o1.getPrice() - o2.getPrice());
            }
        });
    }

    // filtering kit by price range
    public void filterByPrice(int[] parameters) {
        int from = parameters[0];
        int to = parameters[1];
        filteredKit = new ArrayList<>();

        for (Ammunition ammo : kit) {
            if (ammo.getPrice() >= from && ammo.getPrice() <= to)
                filteredKit.add(ammo);
        }
    }
}
