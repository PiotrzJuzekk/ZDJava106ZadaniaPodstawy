package pl.sdacademy.java.basic.exercises.day3.Task7;

public class Main {

    public static void main(String[] args) {
        String name;

        Cat[] cats = new Cat[3];
        cats[0] = new Cat(name = "Burek");
        cats[1] = new Cat(name = "Filemon");
        cats[2] = new Cat(name = "Bonifacy");

        int i = 2;
        for (Cat cat : cats) {
            cat.makeSound();
            cat.eatMice(i++ * i);
            cat.print();
        }

        Cat cat = new Cat(name = "Burek");
        System.out.println(cat.getName());
        cat.setName("Mruczek");
        System.out.println(cat.getName());
    }
}
