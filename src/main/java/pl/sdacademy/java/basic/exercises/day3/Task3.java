package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {
    private static final String NUMBER_REGEX = "-?\\d+(,[0-9]+)?"; // jesli pojawi sie przecinek to pojawia sie cyfry

    public static void main(String[] args) {
        String number = "12341234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "123,41234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "-12341234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "-12 341234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

    }

    private static boolean isCorrectNumber(String number) {
        // true -> 1234 | 1234,1234 | 0,1234 | -1234
        // false -> 1234, | ,1234 | 1234a1234 | 1234 1234
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        return pattern.matcher(number).matches();
    }
}
