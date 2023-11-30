import java.util.Comparator;

public class AnimalByAgeComparator implements Comporator<PatAnimal>, Comparator<PatAnimal> {

    private Order order;

    public AnimalByAgeComparator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(PatAnimal t1, PatAnimal t2) {
        if(order==Order.ASCENDING){
            return Integer.compare(t1.getAge(),t2.getAge());
        }
        else if (order==Order.DESCENDING){
            return Integer.compare(t2.getAge(),t1.getAge());
        }
        return 0;
    }

    @Override
    public Comparator<PatAnimal> reversed() {
        return Comparator.super.reversed();
    }
}

