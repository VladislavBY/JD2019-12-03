package by.it.popkov.jd01_03;


class Helper {

    /**
     * @param result - takes double[]
     * @return return minimum element of double[] result
     */
    static double findMin(double[] result) {
        double min = Double.MAX_VALUE;
        for (double v : result) {
            if (v < min) min = v;
        }
        return min;
    }

    /**
     * @param result - takes double[]
     * @return return maximum element of double[] result
     */
    static double findMax(double[] result) {
        double max = Double.MIN_VALUE;
        for (double v : result) {
            if (v > max) max = v;
        }
        return max;
    }

    static void sort(double[] result) {
        for (int i = result.length - 1; i >= 0; i--) {
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    double stash = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = stash;
                    check = false;
                }
            }
            if (check) break;
        }
    }
}
