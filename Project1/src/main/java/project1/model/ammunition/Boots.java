package project1.model.ammunition;

public class Boots extends Ammunition{
    private int armor;
    private int movementSpeed;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public Boots(String name, double price, Material material, TypeOfAmmo typeOfAmmo, int armor, int movementSpeed) {
        super(name, price, material, typeOfAmmo);
        this.armor = armor;
        this.movementSpeed = movementSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", armor = " + armor + ", movementSpeed = " + movementSpeed;
    }
}
