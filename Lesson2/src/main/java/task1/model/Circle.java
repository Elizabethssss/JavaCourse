package task1.model;

public class Circle extends Shape {
    private double r;

    public Circle(String shapeColor, double r) {
        super(shapeColor);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + r;
    }

    @Override
    public double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public String draw() {
        return this.toString();
    }

    public static Shape parseShape(String input) {
        String[] tokens = input.split(", ");
        return new Circle(tokens[0], Double.parseDouble(tokens[1]));
    }

}
