package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String[] words;
        Dictionary dictionary = new Dictionary();

        while (!input.equals("exit")) {
            System.out.println("Enter phrase to translate (type 'exit' for end): ");
            input = scanner.nextLine().toLowerCase();
            words = input.split(" ");
            dictionary.getTranslation(words);
        }
    }
}
