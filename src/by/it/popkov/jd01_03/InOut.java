package by.it.popkov.jd01_03;

class InOut {
    static double[] getArray(String line) {
        String[] s = line.trim().split(" ");
        double[] outPut = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            outPut[i] = Integer.parseInt(s[i]);
        }
        return outPut;
    }

    static void printArray(double[] result) {
        for (double v : result) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    static void printArray(double[] result, String name, int num) {
        System.out.println(name);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-4.1f| ", result[i]);
            if ((i + 1) % num == 0) System.out.println();
        }
        System.out.println();
    }

}


