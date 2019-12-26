package task1.controller;

import task1.model.Journal;
import task1.model.Student;
import task1.model.Validator;
import task1.view.Util;
import task1.view.View;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Util util = new Util();
    Journal journal = new Journal();
    Validator validator = new Validator();
    Scanner scanner = new Scanner(System.in);
    Student student;
    int command = 0;

    public void process() {
        while (command != 3){
            command = checkIntInput(3);
            processMenu(command);
        }
    }

    private int checkIntInput(int n) {
        String in;
        int num;
        while(true) {
            view.printMessage(util.MENU);
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 1 || num > n) throw new Exception();
                break;
            }
            catch (Exception e) {
                view.printWrongMessage(util.WRONG_INPUT);
            }
        }
        return num;
    }

    private void processMenu(int num) {
        switch (num){
            case 1: view.print(journal.getStudents());
            case 2: processAdding();
            default: break;
        }
    }

    private void processAdding() {
        student = new Student();
        String inp;

        for (Util.Enter enter : Util.Enter.values()) {
            while (true) {
                view.printMessage(enter.getInfo());
                inp = scanner.nextLine();
                if(validator.validateNames(inp, enter.name()))
                    break;
                else
                    view.printWrongMessage(util.WRONG_INPUT);
            }
            switch (enter) {
                case SURNAME: student.setSurname(inp);
                case NAME: student.setName(inp);
                case BIRTH: student.setBirth(inp);
                case TELEPHONE: student.setTelephone(inp);
                case ADDRESS: student.setAddress(inp);
                default: break;
            }
        }
        journal.addStudent(student);
    }

}
