package src;

import java.util.Random;

public class GeradorArrays {
    public static int[] generateRandomData(int size) {
        int[] dataSet = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            dataSet[i] = random.nextInt(size + 1);
        }

        return dataSet;
    }
}