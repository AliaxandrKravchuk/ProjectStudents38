package com.hw5task.sort;

public class Bubble {

    public void bubble(int[] randomN) {

        boolean bubbleSort = false;
        int temp;
        while (!bubbleSort) {
            bubbleSort = true;
            for (int i = 0; i < randomN.length - 1; i++) {
                if (randomN[i] > randomN[i + 1]) {
                    bubbleSort = false;
                    temp = randomN[i];
                    randomN[i] = randomN[i + 1];
                    randomN[i + 1] = temp;
                }
            }
        }
    }
}
