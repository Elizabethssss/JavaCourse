package task1.model;

public class TransformerCar extends task1.model.Car {
    private int numOfStates;

    public int getNumOfStates() {
        return numOfStates;
    }

    public void setNumOfStates(int numOfStates) {
        this.numOfStates = numOfStates;
    }

    @Override
    public String toString() {
        return super.toString() + ", numOfStates = " + numOfStates;
    }

    public TransformerCar(String country, int price, String material, String color, int numOfStates) {
        super(country, price, material, color);
        this.numOfStates = numOfStates;
    }
}
