package by.it.popkov.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = step1(n);
        step2(a);
    }

    private static int step2(int[][] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            int counterOfPlus = 0;
            int inSum = 0;
            for (int j = 0; j < mas.length; j++) {
                if (mas[i][j] > 0 && counterOfPlus == 0) {
                    counterOfPlus++;
                }
                if (mas[i][j] < 0 && counterOfPlus == 1) {
                    inSum += mas[i][j];
                }
                if (mas[i][j] > 0 && counterOfPlus == 1) {
                    sum+=inSum;
                    break;
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    private static int[][] step1(int n) {
        int[][] mas = new int[n][n];
        int counterPlus = 0;
        int counterMinus = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                Random rand = new Random();

                if (rand.nextBoolean()) {
                    mas[i][j] = rand.nextInt(n + 1);
                } else {
                    mas[i][j] = 0 - rand.nextInt(n + 1);
                }
                if (mas[i][j] == n) {
                    counterPlus++;
                } else if (mas[i][j] == 0 - n) {
                    counterMinus++;
                }
            }
        }
        if (counterPlus > 0 && counterMinus > 0) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            step1(n);
        }
        return mas;
    }
}
