package pl.sdacademy.java.basic.exercises.day1.Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.println("Calculating ...");
            System.out.println("New calculation or 'Stop' :");
            decision = scanner.nextLine();
        } while(!("Stop".equalsIgnoreCase(decision)));      // (!(decision.equalsIgnoreCase("Stop")))
    }
}
