package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task6 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.print("Please insert date [" + INPUT_DATE_FORMAT + "]: ");
        LocalDateTime lessonDate = LocalDateTime.parse(
                scanner.nextLine(),
                DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT));

        Duration duration = Duration.between(localDateTime, lessonDate);

        System.out.println("You have " + duration.toDays() + " days to next lesson");

//        punkt b

        long millis = Duration.between(localDateTime, lessonDate).toMillis();
        System.out.println("Millis: " + millis);

        long days = TimeUnit.MILLISECONDS.toDays(millis);// -> dni
        long hours = TimeUnit.MILLISECONDS.toHours(millis) - TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(hours);

        System.out.println("days: " + days);
        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes);
    }
}
