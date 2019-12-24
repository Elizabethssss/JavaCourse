package project1.model.ammunition;

public class Shield extends Ammunition{
    private int damage;
    private int armour;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public Shield(String name, double price, Material material, TypeOfAmmo typeOfAmmo, int damage, int armour) {
        super(name, price, material, typeOfAmmo);
        this.damage = damage;
        this.armour = armour;
    }

    @Override
    public String toString() {
        return super.toString() + ", armour = " + armour + ", damage = " + damage;
    }
}
