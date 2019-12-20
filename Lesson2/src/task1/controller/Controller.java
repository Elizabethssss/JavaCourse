package task1.controller;

import task1.model.*;
import task1.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    View view = new View();

    ArrayList<Shape> shapes = new ArrayList<>();

    public Controller() {
        shapes.add(new Rectangle("Red", 12, 4));
        shapes.add(new Rectangle("Green", 7.5, 1.33));
        shapes.add(new Rectangle("Blue", 1, 2));
        shapes.add(new Rectangle("White", 5, 55));
        shapes.add(new Triangle("Yellow", 11, 6, 13));
        shapes.add(new Triangle("Red", 3.3, 4.4, 5.5));
        shapes.add(new Triangle("Black", 90, 1, 90));
        shapes.add(new Circle("Purple", 6));
        shapes.add(new Circle("Green", 77));
        shapes.add(new Circle("Yellow", 3.14));
        shapes.add(new Circle("Blue", 2));
        shapes.add(new Circle("Cyan", 13));
        shapes.add(new Circle("Red", 0.8));
    };

    public void process(){
        String inp = "";
        view.print(shapes);
        while (!inp.equals("n")) {
            view.printMessage("Do you want add new shape? (y, n): ");
            inp = scanner.nextLine();
            if(inp.equals("y"))
                parseNewShape();
            else if(!inp.equals("n"))
                view.printMessage("Wrong input!!!!");
        }
        view.print(shapes);
        view.printSum();
        view.printMessage("Sorted by area:");
        shapes.sort((o1, o2) -> (int) (o1.calcArea() - o2.calcArea()));
        view.print(shapes);
        view.printMessage("Sorted by color: ");
        shapes.sort(Comparator.comparing(Shape::getShapeColor));
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

    private void parseNewShape() {
        view.printMessage("Enter 'Shape: color, a...'");
        String inp = scanner.nextLine();
        String type = inp.substring(0, inp.indexOf(":")).toUpperCase();
        switch (ShapeTypes.valueOf(type)) {
            case CIRCLE:
                inp = inp.substring(8);
                shapes.add(Circle.parseShape(inp));
                break;
            case TRIANGLE:
                inp = inp.substring(10);
                shapes.add(Triangle.parseShape(inp));
                break;
            case RECTANGLE:
                inp = inp.substring(11);
                shapes.add(Rectangle.parseShape(inp));
                break;
            default:
                view.printMessage("Wrong input!!!");
        }
    }

}
