package pl.sdacademy.java.basic.exercises.day2.Task15;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "maa", "kota"};
        System.out.println("Frist array: " + Arrays.toString(firstArray));
        System.out.println("Second array" + Arrays.toString(secondArray));
        System.out.println("Result: " + areEqual(firstArray, secondArray));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
                return false; //pierwsza różnica od razu oknczymy petle i zwraca false
            }
        }
        return false;
    }
}
