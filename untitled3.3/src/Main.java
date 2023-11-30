import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cat tom = new Cat("tom", LocalDate.of(2020, 2, 21),2);
        Cat mursa = new Cat("mursa", LocalDate.of(2002, 1, 1),5);
        Cat murzic = new Cat("murzic", LocalDate.of(2004, 7, 31),9);
        Dog shyric = new Dog("shyric", LocalDate.of(2009, 9, 14),2);
        Dog zver = new Dog("zver", LocalDate.of(2016, 3, 11),5);
        Dog luna = new Dog("luna", LocalDate.of(2022, 12, 10),1);

        List<Cat> cats = new ArrayList<>(List.of(tom,mursa,murzic));
        cats.sort(Comparator.comparingInt(Cat::getCaughtMiceCount));
        for (Cat cat:cats) {
            System.out.println(cat);
        }
        System.out.println("-----------------------------------");
        List<Dog> dogs=new ArrayList<>(List.of(shyric,zver,luna));
        dogs.sort(Comparator.comparingInt(Dog::getScaredOfThievesCount));
        for (Dog dog:dogs) {
            System.out.println(dog);
        }
        System.out.println("------------------------");
        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));
        for (PatAnimal animal:rancho) {
            System.out.println(animal.getNam()+" "+animal.getAge()+" Years");

        }
    }
}