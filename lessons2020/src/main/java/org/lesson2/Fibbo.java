package org.lesson2;

import java.math.BigInteger;
import java.util.Arrays;


public class Fibbo {
    public static void main(String[] args) {
        System.out.println("Non recursive: " + nonRecursive(5));
        System.out.println("Recursive: " + recursive(7));

        int[] arr = new int[] {30, 32, 1, 10, 15, 3, 77, 17, 16, 15, 2};

        //bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("BigInteger: " + factorial(30));

    }


    static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");

        for(int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static long nonRecursive(int n) {
        long result = 0, t1 = 1, t2 = 1;
        if(n == 1 || n == 2) return t1;


        for(int i = 0; i < n - 2; i++) {
            result = t1 + t2;
            t1 = t2;
            t2 = result;
        }


        return result;
    }

    static long recursive(int n) {
        if(n == 1 || n == 2) return 1;
        return recursive(n - 1) + recursive(n - 2);
    }

}
