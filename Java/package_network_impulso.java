package network.impulso;

import java.util.Arrays;

class Main {
    public static void todaysQuiz(int[] arrayOfNumbers) {
        int nonZero = 0;
        for (int i : arrayOfNumbers) {
            if (i != 0) {
                arrayOfNumbers[nonZero++] = i;
            }
        }
        for (int i = nonZero; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 0, 8, 2, 3, 0, 4, 0, 1};
        todaysQuiz(nums);
        System.out.println(Arrays.toString(nums));
    }
}