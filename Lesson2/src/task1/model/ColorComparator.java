package task1.model;

import java.util.Comparator;

public class ColorComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape sh1, Shape sh2) {
        String color1 = sh1.getShapeColor();
        String color2 = sh2.getShapeColor();
        return color1.compareTo(color2);
    }
}
