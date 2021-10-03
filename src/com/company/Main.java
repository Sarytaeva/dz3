package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] arg) {
        double[] array = {1.1, 2.1, 3.2, -5.2, -6.3, 3.5, -7.5, -4.4, -56.4, 1.6, 78.6, 56.7, 23.2, 4.5, -65.7, 35.5};

        double plus = 0;
        int count = 0;
        boolean isNegative = false;

        for (double i : array) {
            if (i > 0 && isNegative) {
                plus += i;
                count = count + 1;

            } else if (i < 0) {
                isNegative = true;
            }

        }
        System.out.println(plus / count);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));

        }
        System.out.println();
        System.out.println(Arrays.toString(array));

    }
}
