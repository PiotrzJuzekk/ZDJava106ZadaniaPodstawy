package pl.sdacademy.java.basic.exercises.day3.Task7;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void makeSound() {
        System.out.println("Meow meow");
    }

    void eatMice(int mice) {
        System.out.println("I ate " + mice + " mice");
    }

    public void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
