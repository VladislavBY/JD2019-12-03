package by.it.popkov.jd01_03;


import java.util.Arrays;

class Runner {
    public static void main(String[] args) {
        double[] result = InOut.getArray(" 2 21 542 234 12 435 324 2 2349 120 34 ");
        System.out.println(Arrays.toString(result));
        InOut.printArray(result);
        InOut.printArray(result, "Array", 5);
        double min = Helper.findMin(result);
        double max = Helper.findMax(result);
        Helper.sort(result);
        System.out.println(Arrays.toString(result));

    }
}
