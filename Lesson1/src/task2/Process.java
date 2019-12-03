package task2;

public class Process {
    void process(int number) {
        int sum;
        for(int i = 2; i < number; i++){
            sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if(i % j == 0)
                    sum += j;
            }
            if (sum == i)
                printResult(sum);
        }
    }
    void printResult(int sum) {
        System.out.println("result: " + sum);
    }
}
