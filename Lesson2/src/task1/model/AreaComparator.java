package task1.model;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape sh1, Shape sh2) {
        return (int) (sh1.calcArea() - sh2.calcArea());
    }
}
