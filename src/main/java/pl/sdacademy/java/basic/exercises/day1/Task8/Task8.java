package pl.sdacademy.java.basic.exercises.day1.Task8;

public class Task8 {
    public static void main(String[] args) {
        int rangeFrom = Integer.parseInt(args[0]);
        int rangeTo = Integer.parseInt(args[1]);
        System.out.println("Range From: " + rangeFrom);
        System.out.println("Range To: " + rangeTo);

        while(rangeFrom <= rangeTo) {
            if(rangeFrom % 2 == 0) {
                System.out.println(rangeFrom);
            }
            rangeFrom++;
        }
    }
}
