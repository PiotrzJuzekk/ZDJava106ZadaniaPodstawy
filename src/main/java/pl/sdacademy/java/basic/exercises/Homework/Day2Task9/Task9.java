package pl.sdacademy.java.basic.exercises.Homework.Day2Task9;

import java.util.Scanner;

public class Task9 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userText;
        String longestWord = null;
        int longestWordLength = 0;
        do {
            System.out.print("Please insert your text: ");
            userText = scanner.nextLine();
            if (userText.isBlank()) {
                System.out.println("No input");
            } else if (!"Enough".equalsIgnoreCase(userText)) {
                if (longestWordLength < userText.length()) {
                    longestWord = userText;
                    longestWordLength = userText.length();
                }
            }
        } while (!"enough".equalsIgnoreCase(userText));
        System.out.println("Result: " + longestWord);
    }
}
