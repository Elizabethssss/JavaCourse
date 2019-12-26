package task1.view;

import task1.model.Student;

import java.util.ArrayList;

public class View {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongMessage(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m\n");
    }

    public void print(ArrayList<Student> students) {
        System.out.println("******************************************************************************************");
        for (Student student : students)
            System.out.println(student.toString());
        System.out.println("******************************************************************************************");
    }
}
