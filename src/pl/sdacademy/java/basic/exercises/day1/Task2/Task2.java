package pl.sdacademy.java.basic.exercises.day1.Task2;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getDiameterFromUser();

        float circumference = calculateCircumferenceOfCircle(diameter);
        System.out.println("Circumference Of A Cricle: " + circumference);

        float area = calculateAreaOfCircle(diameter);
        System.out.println("Area Of A Circle: " + area);
    }
    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diameter: ");
        return scanner.nextFloat();
    }
    private static float calculateCircumferenceOfCircle(float diameter) {
        // 2*pi*r -> pi*d
//        return PI * diameter;
        return (float) Math.PI * diameter;
    }
    private static float calculateAreaOfCircle(float diameter) {
        // pi * r ^2
        float radius = diameter/2;
        return (float) Math.PI * radius * radius;
    }
}
