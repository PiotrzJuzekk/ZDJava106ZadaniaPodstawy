package pl.sdacademy.java.basic.exercises.day2.Task10;

public class Task10 {
    public static void main(String[] args) {
        int number = 123;
        int result = sumOfDigits(number);
        System.out.println("Sum: " + result);

    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while(number != 0) { // number = 123
            sum += number % 10; // sum = 0+3 , number % 10 = 3
            number /= 10; // number / 10 = 12
        }
        return sum;
    }
}
