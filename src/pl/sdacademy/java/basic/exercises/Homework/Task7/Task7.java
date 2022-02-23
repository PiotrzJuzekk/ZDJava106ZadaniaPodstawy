package pl.sdacademy.java.basic.exercises.Homework.Task7;

import java.util.Scanner;

public class Task7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args ) {
        String decision;

        do {
            float firstNumber = getFirstNumber();
            scanner.nextLine();
            String operator = getOperator();
            float secondNumber = getSecondNumber();
            scanner.nextLine();
            float result = calculate(firstNumber, secondNumber, operator);
            System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
            System.out.println("Next calculation or stop? ");
            decision = scanner.nextLine();
        } while (!"Stop".equalsIgnoreCase(decision));
}
    private static float getFirstNumber() {
        System.out.println("Podaj pierwszą liczbę: ");
        float firstNumber = scanner.nextFloat();
        return firstNumber;
    }

    private static String getOperator() {
        System.out.println("Wpisz '+', '-', '*' lub '/': ");
        String operator = scanner.nextLine();
        return operator;
    }

    private static float getSecondNumber() {
        System.out.println("Podaj drugą liczbę: ");
        float secondNumber = scanner.nextFloat();
        return secondNumber;
    }

    private static float calculate(float a, float b, String operator) {
        float result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if ( b == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1);
                }
                result = a / b;
                break;
            default:
                System.out.println("Operator not exist");
                System.exit(1);
        }
        return result;
    }

    }

