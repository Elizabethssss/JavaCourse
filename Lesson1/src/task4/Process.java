package task4;

public class Process {
    int[][] matrix;
    int[][] result;

    Process(int num){
        matrix = new int[num][num];
        result = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = (int)(Math.random() * 198) - 99;

            }
        }
    }

    void process() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = matrix[j][matrix.length - i - 1];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.arraycopy(result[i], 0, matrix[i], 0, result.length);
        }
    }

    void print(){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] >= 0) System.out.print(" " + ints[j] + "\t\t");
                else System.out.print(ints[j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
    }
}
