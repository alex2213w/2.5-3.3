import java.time.LocalDate;

public class PatAnimal {
    private String name;
    private LocalDate yearOFBirth;

    public PatAnimal(String name, LocalDate yearOFBirth) {
        this.name = name;
        this.yearOFBirth = yearOFBirth;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOFBirth.getYear();
    }

    public String getNam() {
        return name;
    }

    public void sleep() {

    }

    public void makeSound() {

    }
}
