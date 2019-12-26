package task1.model;

import java.util.ArrayList;

public class Journal {
    ArrayList<Student> students = new ArrayList<>();

    public Journal() {
        students.add(new Student("Val", "Elizabeth", "24.06.2001", "+38(093)00-00-000",
                "Golos 13, room 123"));
    students.add(new Student("Pinky", "Dima", "11.11.1999", "+38(050)11-11-111",
                "Teremki 1, room 2"));
    students.add(new Student("Rogoviy", "Toxa", "03.03.2000", "+38(067)22-22-222",
                "Sviatik 7, room 77"));
    students.add(new Student("Alyoshko", "Lexus", "16.12.2000", "+38(063)33-33-333",
                "Cyprus 30, room 330"));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
