package project1.model.ammunition;

public class Weapon extends Ammunition{
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(String name, double price, Material material, TypeOfAmmo typeOfAmmo, int damage) {
        super(name, price, material, typeOfAmmo);
        this.damage = damage;
    }

    @Override
    public String toString() {
        return super.toString() + ", damage = " + damage;
    }
}
