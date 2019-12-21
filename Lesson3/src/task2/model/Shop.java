package task2.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartments(Department department) { departments.add(department); }

    public void removeDepartments(Department department) { departments.remove(department); }

    public Shop() {}

    public Shop(String name, ArrayList<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public class Department {
        private String name;
        private String[] typesOfProduct;
        private String[] services;
        private String location;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String[] getTypesOfProduct() {
            return typesOfProduct;
        }

        public void setTypesOfProduct(String[] typesOfProduct) {
            this.typesOfProduct = typesOfProduct;
        }

        public String[] getServices() {
            return services;
        }

        public void setServices(String[] services) {
            this.services = services;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public Department () {}

        public Department(String name, String[] typesOfProduct, String[] services, String location) {
            this.name = name;
            this.typesOfProduct = typesOfProduct;
            this.services = services;
            this.location = location;
        }

        @Override
        public String toString() {
            return "Department: name = " + name + ", typesOfProduct = " + Arrays.toString(typesOfProduct) +
                    ", services = " + Arrays.toString(services) + ", location = " + location;
        }
    }

    @Override
    public String toString() {
        return "Shop: " + "name = " + name;
    }
}
