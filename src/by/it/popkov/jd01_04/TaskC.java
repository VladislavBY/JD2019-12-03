package by.it.popkov.jd01_04;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        double[] array = new double[]{9.0, 8.0, 11.0, 3.0, 5.0, 6.0, 4.0};
        TaskC.mergeSort(array);
        System.out.println(Arrays.toString(TaskC.merge(new double[]{8, 9, 11}, new double[]{3, 4, 5, 6})));
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        TaskC.mergeSort(array);
        InOut.printArray(array, "V", 4);
        System.out.printf("Index of first element=%d\n", Arrays.binarySearch(array, first));
        System.out.printf("Index of last element=%d\n", Arrays.binarySearch(array, last));


    }

    static void mergeSort(double[] array) {
        double[] left = new double[array.length / 2];
        double[] right = new double[array.length - array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < array.length - array.length / 2; i++) {
            right[i] = array[i + array.length / 2];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        if (left.length != 1) {
            mergeSort(left);
        }
        if (right.length != 1) {
            mergeSort(right);
        }

    }

    private static double[] merge(double[] part1, double[] part2) {
        double[] outPut = new double[part1.length + part2.length];
        for (int i = 0, one = 0, two = 0; i < outPut.length; i++) {
            if (part1[one] < part2[two]) { //ArrayIndexOutOfBoundsException
                outPut[i] = part1[one];
                one++;
            }
            if (part1[one] > part2[two]) { //ArrayIndexOutOfBoundsException
                outPut[i] = part2[two];
                two++;
            }
        }
        return outPut;
    }
}
