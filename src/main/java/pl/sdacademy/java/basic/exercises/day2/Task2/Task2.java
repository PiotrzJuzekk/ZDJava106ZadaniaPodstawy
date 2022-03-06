package pl.sdacademy.java.basic.exercises.day2.Task2;

public class Task2 {

    public static void main(String[] args) {
        isWordStartsWithPrefix("programowanie", "pro");
    }

    private static boolean isWordStartsWithPrefix(String input, String prefix) {
        // logika ? akcja gdy true : akcja gdy false
        return input != null ? input.startsWith(prefix) : false;
//        if(input != null) {
//            return input.startsWith(prefix);
//        }
//        return false;
    }

}
