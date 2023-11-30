import java.time.LocalDate;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat> {
    private int caughtMiceCount;

    public Cat(String name, LocalDate yearOFBirth, int caughtMiceCount) {
        super(name, yearOFBirth);
        this.caughtMiceCount = new Random().nextInt(getAge() * getAge() + 1);
    }

    public int getCaughtMiceCount() {
        return caughtMiceCount;
    }

    @Override
    public String toString() {
        return "Cat " + getNam() + " caught " + getCaughtMiceCount()+" mice";
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.caughtMiceCount, o.caughtMiceCount);

    }


}
