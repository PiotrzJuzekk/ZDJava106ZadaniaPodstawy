package pl.sdacademy.java.basic.exercises.Homework.Day2Task7;

public class Task7 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char space = ' ';
        double sumSpace = 0;
        getSpacePercent(input, space, sumSpace);
        System.out.println("Result: " + getSpacePercent(input, space, sumSpace));
    }

    private static double getSpacePercent(String input, char space, double sumSpace) {
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == space) {
                    sumSpace++;
                }
            }
        }
        return (sumSpace / input.length()) * 100;
    }
}
