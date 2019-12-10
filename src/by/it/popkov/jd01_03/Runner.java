package by.it.popkov.jd01_03;


import java.util.Arrays;

class Runner {
    public static void main(String[] args) {
        double[] result = InOut.getArray("1 2 3");
        System.out.println(Arrays.toString(result));
        InOut.printArray(result);
        InOut.printArray(result, "Vlad", 5);
    }
}
