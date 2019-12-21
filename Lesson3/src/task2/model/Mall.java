package task2.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Mall {
    Shop shop;
    Shop.Department department;

    public Shop getShop() {
        return shop;
    }

    public Mall() {
        shop = new Shop();
        shop.setName("Auchan");
        department = shop.new Department("Dairy", new String[]{"Milk", "Cheese", "Butter", "Yogurt"},
                new String[]{"Cheese degustation"}, "At the end of the store");
        shop.addDepartments(department);

        department = shop.new Department("Butchery", new String[]{"Chicken", "Rabbit", "Pork", "Lamb", "Sausages"},
                new String[]{"Chop meat", "Slice", "Sausages degustation"}, "Near diary department");
        shop.addDepartments(department);

        department = shop.new Department("Bakery", new String[]{"Bread", "Pizza", "Pie", "Bun", "Baguette"},
                new String[]{"Make fresh bread", "Heat pizza", "Make pizza", "Pie degustation"}, "Left side of shop");
        shop.addDepartments(department);

        department = shop.new Department("Fruit and Vegetables", new String[]{"Apple", "Banana", "Orange", "Mango",
                "Pineapple", "Cucumber", "Tomato", "Mushroom", "Pepper", "Berries", "Watermelon"}, new String[]{
                        "Weight products", "Change tarra", "Slice"}, "Right side of shop");
        shop.addDepartments(department);

        department = shop.new Department("Sweets", new String[]{"Lollipop", "Chocolate", "Gummy bears", "Cookies",
        "Marshmello"}, new String[]{"Weight sweets", "Digustate new tastes"}, "Left side of shop");
        shop.addDepartments(department);
    }

    public void addDepartment(Shop.Department dep) {
        shop.addDepartments(dep);
    }

    public void removeDepartment(String str) {
        ArrayList<Shop.Department> temp = new ArrayList<>();
        for(Shop.Department dep : shop.getDepartments())
            if (dep.toString().contains(str))
                temp.add(dep);
        for (Shop.Department dep : temp)
            shop.removeDepartments(dep);
    }

    public void sortDepartmentsBy(int num) {
        switch (num) {
            case 1:
                shop.getDepartments().sort(Comparator.comparing(Shop.Department::getName));
                break;
            case 2:
                shop.getDepartments().sort(Comparator.comparingInt(o -> o.getTypesOfProduct().length));
                break;
            case 3:
                shop.getDepartments().sort(Comparator.comparingInt(o -> o.getServices().length));
                break;
            case 4:
                break;
        }
    }

}
