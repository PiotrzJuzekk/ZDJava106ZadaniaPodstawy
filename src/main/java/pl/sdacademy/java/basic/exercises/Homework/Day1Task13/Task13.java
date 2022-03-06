package pl.sdacademy.java.basic.exercises.Homework.Day1Task13;

import java.util.Scanner;

public class Task13 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        int totalDigits = 0;
        int totalEvenDigits = 0;
        int totalSum = 0;

        do {
            System.out.print("Please insert digit: ");
            number = scanner.nextInt();
            scanner.nextLine();
            totalDigits++;
            if (number % 2 == 0) {
                totalEvenDigits++;
            }
            totalSum += number;
        } while (number != 0);

        System.out.println("Total Number Of Digits: " + totalDigits);
        System.out.println("Total Number Of Even Digits: " + totalEvenDigits);
        float arithmeticAverage = (float) totalSum / totalDigits;
        System.out.println("Arithmetic Average: " + arithmeticAverage);
    }
}
