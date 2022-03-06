package pl.sdacademy.java.basic.exercises.day2.Task3;

import java.util.function.BinaryOperator;

public class Task3 {
    public static void main(String[] args) {
        String input = "";

        String word = "ma";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));

        word = "";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));
    }

    private static int getIndex(String input, String word) {
        if (input != null && word != null && !input.isBlank() && !word.isBlank()) {
            return input.contains(word) ? input.indexOf(word) : -1;
        }
        return -1;
    }

}
