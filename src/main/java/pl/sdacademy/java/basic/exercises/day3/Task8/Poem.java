package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Poem {
    private Author creator;
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }
    public void print() {
        System.out.println(this);
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumber=" + stropheNumber +
                '}';
    }
}
