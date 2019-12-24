package project1.model;

import project1.model.ammunition.*;

import java.util.ArrayList;

public class AmmoStorage {
    ArrayList<Ammunition> kit1 = new ArrayList<>();
    ArrayList<Ammunition> kit2 = new ArrayList<>();
    ArrayList<Ammunition> kit3 = new ArrayList<>();
    ArrayList<Ammunition> kit4 = new ArrayList<>();
    ArrayList<Ammunition> kit5 = new ArrayList<>();
    ArrayList<Ammunition> kit6 = new ArrayList<>();

    public AmmoStorage() {
        kit1.add(new Helmet("Iron hat", 1550, Material.IRON, TypeOfAmmo.HELMET, 134));
        kit1.add(new ArmorTop("Iron breastplate", 2550, Material.IRON, TypeOfAmmo.TOP, 495));
        kit1.add(new ArmorBottom("Iron leggings", 1997, Material.IRON, TypeOfAmmo.BOTTOM, 300));
        kit1.add(new Boots("Iron boots", 1300, Material.IRON, TypeOfAmmo.BOOTS, 98, 4));
        kit1.add(new Weapon("Iron sword", 2500, Material.IRON, TypeOfAmmo.WEAPON, 420));
        kit1.add(new Shield("Iron shield", 1800, Material.IRON, TypeOfAmmo.SHIELD, 66, 207));

        kit2.add(new Helmet("Cap", 150, Material.COTTON, TypeOfAmmo.HELMET, 1));
        kit2.add(new ArmorTop("Shirt", 400, Material.COTTON, TypeOfAmmo.TOP, 3));
        kit2.add(new ArmorBottom("Pants", 200, Material.COTTON, TypeOfAmmo.BOTTOM, 2));
        kit2.add(new Boots("Boots", 999, Material.COTTON, TypeOfAmmo.BOOTS, 0, 7));
        kit2.add(new Weapon("Crutch", 0, Material.WOOD, TypeOfAmmo.WEAPON, 17));

        kit3.add(new Helmet("Gold crown", 25500, Material.GOLD, TypeOfAmmo.HELMET, 15));
        kit3.add(new ArmorTop("Diamond breastplate", 55550, Material.BRILLIANT, TypeOfAmmo.TOP, 350));
        kit3.add(new ArmorBottom("Gold leggings", 19997, Material.GOLD, TypeOfAmmo.BOTTOM, 271));
        kit3.add(new Boots("Shoes with swarovski", 5300, Material.BRILLIANT, TypeOfAmmo.BOOTS, 18, 3));
        kit3.add(new Weapon("Two-handed ax", 30000, Material.GOLD, TypeOfAmmo.WEAPON, 386));

        kit4.add(new ArmorTop("Мантия", 3550, Material.LEATHER, TypeOfAmmo.TOP, 40));
        kit4.add(new Boots("Тапки мага", 1330, Material.COTTON, TypeOfAmmo.BOOTS, 11, 7));
        kit4.add(new Weapon("Посох огня", 5050, Material.WOOD, TypeOfAmmo.WEAPON, 500));

        kit5.add(new Helmet("Cowboy hat", 4772, Material.LEATHER, TypeOfAmmo.HELMET, 14));
        kit5.add(new ArmorTop("Jacket", 1550, Material.LEATHER, TypeOfAmmo.TOP, 41));
        kit5.add(new ArmorBottom("Leggings", 997, Material.LEATHER, TypeOfAmmo.BOTTOM, 30));
        kit5.add(new Boots("High boot", 800, Material.LEATHER, TypeOfAmmo.BOOTS, 8, 9));
        kit5.add(new Weapon("Iron daggers", 2500, Material.IRON, TypeOfAmmo.WEAPON, 350));

        kit6.add(new Helmet("Wooden panama hat", 1350, Material.WOOD, TypeOfAmmo.HELMET, 34));
        kit6.add(new ArmorTop("Кольчуга", 1833, Material.CHAIN_ARMOUR, TypeOfAmmo.TOP, 125));
        kit6.add(new ArmorBottom("Shorts", 97, Material.COTTON, TypeOfAmmo.BOTTOM, 4));
        kit6.add(new Boots("Golden high heals", 13000, Material.GOLD, TypeOfAmmo.BOOTS, 28, 4));
        kit6.add(new Shield("Heavy shield", 800, Material.STONE, TypeOfAmmo.SHIELD, 160, 260));
    }

    public ArrayList<Ammunition> getKit1() {
        return kit1;
    }

    public ArrayList<Ammunition> getKit2() {
        return kit2;
    }

    public ArrayList<Ammunition> getKit3() {
        return kit3;
    }

    public ArrayList<Ammunition> getKit4() {
        return kit4;
    }

    public ArrayList<Ammunition> getKit5() {
        return kit5;
    }

    public ArrayList<Ammunition> getKit6() {
        return kit6;
    }
}
