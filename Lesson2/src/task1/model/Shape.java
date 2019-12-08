package task1.model;

public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        String color = "";
        if (shapeColor.equalsIgnoreCase("black")){
            color = "\u001B[30m";
        }if (shapeColor.equalsIgnoreCase("red")){
            color = "\u001B[31m";
        }if (shapeColor.equalsIgnoreCase("green")){
            color = "\u001B[32m";
        }if (shapeColor.equalsIgnoreCase("yellow")){
            color = "\u001B[33m";
        }if (shapeColor.equalsIgnoreCase("blue")){
            color = "\u001B[34m";
        }if (shapeColor.equalsIgnoreCase("purple")){
            color = "\u001B[35m";
        }if (shapeColor.equalsIgnoreCase("cyan")){
            color = "\u001B[36m";
        }if (shapeColor.equalsIgnoreCase("white")){
            color = "\u001B[37m";
        }
        return getClass().getSimpleName() +
                ": colorShape=" + color + shapeColor + "\u001B[0m";
    }

    public abstract double calcArea();
}
