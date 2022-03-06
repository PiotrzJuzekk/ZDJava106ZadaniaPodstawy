package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to start");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.print("Press ENTER to stop");
        scanner.nextLine();
        LocalTime finishTime = LocalTime.now();
        Duration duration = Duration.between(startTime, finishTime);
        System.out.println("Total time: " + duration.toSeconds());
    }
}
