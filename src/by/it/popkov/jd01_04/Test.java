package by.it.popkov.jd01_04;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));


    }
    static void change(int [] a){
        a = new int[]{1,1,1};
    }
}
