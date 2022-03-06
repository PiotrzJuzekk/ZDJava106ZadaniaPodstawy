package pl.sdacademy.java.basic.exercises.day1.Task6;

public class Task6 {
    private static int multiplier = 6;
    private static int minMultiplicand = 2;
    private static int maxMultiplicand = 5;

    public static void main(String[] args) {
        printMultiplicationTable(multiplier, minMultiplicand, maxMultiplicand);
    }
    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
//        for(; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
//            int result = multiplier * minMultiplicand;
//            System.out.println(multiplier + "x " + minMultiplicand + "=" + result);
//        }

        while(minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
