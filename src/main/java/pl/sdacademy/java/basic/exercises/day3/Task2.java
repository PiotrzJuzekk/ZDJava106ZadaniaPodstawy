package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task2 {
    private static final String IBAN_REGEX = "PL[0-9]{26}"; // check RegExp -> option+enter

    public static void main(String[] args) {
        String iban = "PL13567374635272893847563738";
        System.out.println("If IBAN " + iban + " has correct format: " + isCorrectIbanFormat(iban));
    }

    private static boolean isCorrectIbanFormat(String iban) {
        // PL + 26 cyfr
        Pattern pattern = Pattern.compile(IBAN_REGEX);
        return pattern.matcher(iban).matches();
    }
}
