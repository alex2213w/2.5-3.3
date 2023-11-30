import java.time.LocalDate;

public class Dog extends PatAnimal implements Comparable<Dog> {
    private int scaredOfThievesCount;

    public Dog(String name, LocalDate yearOFBirth, int scaredOfThievesCount) {
        super(name, yearOFBirth);
        this.scaredOfThievesCount = scaredOfThievesCount;
    }

    public int getScaredOfThievesCount() {
        return scaredOfThievesCount;
    }

    @Override
    public int compareTo(Dog o) {
        return this.scaredOfThievesCount - o.scaredOfThievesCount;
    }

    @Override
    public String toString() {
        return "Dog " + getNam() + " caught " + getScaredOfThievesCount()+" thieves";

    }
}
