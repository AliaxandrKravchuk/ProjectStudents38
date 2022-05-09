package com.hw5task.sort;

public class QuickSort {

    public static void quickSort(int[] randomN, int left, int right) {
        int leftNum = left;
        int rightNum = right;
        int pivot = randomN[(leftNum + rightNum) / 2];
        do {
            while (randomN[leftNum] < pivot) {
                leftNum++;
            }
            while (randomN[rightNum] > pivot) {
                rightNum--;
            }
            if (leftNum <= rightNum) {
                if (leftNum < rightNum) {
                    int tmp = randomN[leftNum];
                    randomN[leftNum] = randomN[rightNum];
                    randomN[rightNum] = tmp;
                }
                leftNum++;
                rightNum--;
            }
        } while (leftNum <= rightNum);

        if (leftNum < right) {
            quickSort(randomN, leftNum, right);
        }
        if (left < rightNum) {
            quickSort(randomN, left, rightNum);
        }
    }
}
