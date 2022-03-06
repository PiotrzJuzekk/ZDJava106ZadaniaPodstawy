package pl.sdacademy.java.basic.exercises.day2.Task14;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        System.out.println("Inputs: " + Arrays.toString(inputs));
        int lengthOfNewArray = negativeNumbers(inputs);
        if (lengthOfNewArray > 0) {
            int[] newArray = createNewArray(inputs, lengthOfNewArray);
            System.out.println("Result: " + Arrays.toString(newArray));
        }

    }

    private static int negativeNumbers(int[] inputs) {
        int negativeNumbers = 0;
        for (int i: inputs) {
            if (i < 0) {
                negativeNumbers++;
            }
        }
        return negativeNumbers;
    }

    public static int[] createNewArray (int [] inputs, int lengthOfNewArray){
        int [] newArray = new int[lengthOfNewArray];
        int i = 0;
        for (int element: inputs) {
            if (element < 0) {
                newArray[i++] = element;
            }
        }
        return newArray;
    }
}
