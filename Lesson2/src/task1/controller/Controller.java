package task1.controller;

import task1.model.*;
import task1.view.View;

import java.util.Arrays;

public class Controller {
    Shape[] shapes = {
            new Rectangle("Red", 12, 4),
            new Rectangle("Green", 7.5, 1.33),
            new Rectangle("Blue", 1, 2),
            new Rectangle("White", 5, 55),
            new Triangle("Yellow", 11, 6, 13),
            new Triangle("Red", 3.3, 4.4, 5.5),
            new Triangle("Black", 90, 1, 90),
            new Circle("Purple", 6),
            new Circle("Green", 77),
            new Circle("Yellow", 3.14),
            new Circle("Blue", 2),
            new Circle("Cyan", 13),
            new Circle("Red", 0.8)
            };

    public void process(){
        View view = new View();
        view.print(shapes);
        view.printSum();
        Arrays.sort(shapes, new AreaComparator());
        view.print(shapes);
        Arrays.sort(shapes, new ColorComparator());
        view.print(shapes);
    }

    public double sumAllAreas() {
        double sum = 0;
        for (Shape sh : shapes) {
            sum += sh.calcArea();
        }
        return sum;
    }

    public double sumSelectedAreas(String str) {
        double sum = 0;
        for (Shape sh : shapes) {
            if(str.equals("triangle") && sh instanceof Triangle)
                sum += sh.calcArea();
            else if(str.equals("circle") && sh instanceof Circle)
                sum += sh.calcArea();
            else if(str.equals("rectangle") && sh instanceof Rectangle)
                sum += sh.calcArea();
        }
        return sum;
    }
}
