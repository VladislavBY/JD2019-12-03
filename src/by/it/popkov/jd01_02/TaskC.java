package by.it.popkov.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        step1(n);
    }

    private static int[][] step1(int n) {
        int[][] arrays = new int[n][n];
        int counterPlus = 0;
        int counterMinus = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                Random rand = new Random();

                if (rand.nextBoolean()) {
                    arrays[i][j] = rand.nextInt(n + 1);
                } else {
                    arrays[i][j] = 0 - rand.nextInt(n + 1);
                }
                if (arrays[i][j] == n) {
                    counterPlus++;
                } else if (arrays[i][j] == 0 - n) {
                    counterMinus++;
                }
            }
        }
        if (counterPlus > 0 && counterMinus > 0) {
            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    System.out.print(arrays[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            step1(n);
        }
        return arrays;
    }
}
