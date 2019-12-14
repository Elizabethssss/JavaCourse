package task1.model;

public class Constructor extends Toys {
    private int numOfElements;

    public int getNumOfElements() {
        return numOfElements;
    }

    public void setNumOfElements(int numOfElements) {
        this.numOfElements = numOfElements;
    }

    @Override
    public String toString() {
        return super.toString() + ", numOfElements = " + numOfElements;
    }

    public Constructor(String country, int price, String material, int numOfElements) {
        super(country, price, material);
        this.numOfElements = numOfElements;
    }
}