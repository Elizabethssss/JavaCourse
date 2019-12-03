package task3;

public class Process {
    void process(int num) {
        for(int i = 1; i <= num; i++){
            for (int j = num-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
