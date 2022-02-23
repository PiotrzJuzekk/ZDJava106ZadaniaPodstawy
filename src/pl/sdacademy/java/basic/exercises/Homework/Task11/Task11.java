package pl.sdacademy.java.basic.exercises.Homework.Task11;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int randomDigit = getRandomDigit(min, max);
        tooMuchNotEnough(randomDigit);
    }

    private static void tooMuchNotEnough(int randomDigit) {
        for (int i = 0; i < 100; i++) {
            System.out.print("Please insert digit: ");
            int userDigit = scanner.nextInt();
            if (userDigit < randomDigit) {
                System.out.println("Not enough");
            }
            if (userDigit > randomDigit) {
                System.out.println("Too much");
            }
            if (userDigit == randomDigit) {
                System.out.println("Bingo!");
                break;
            }
        }

    }

    private static int getRandomDigit(int a, int b) {
        Random random = new Random();
        return random.nextInt(b - a) + a;
    }
}
