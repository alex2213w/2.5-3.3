import java.util.Objects;

public class Element {
    Integer element;
    Element next;

    public Element(Integer element) {
        this.element = element;
        this.next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Element next() {
        return next;
    }

    public Integer getElement() {
        return element;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element element1)) return false;
        return Objects.equals(element, element1.element) && Objects.equals(next, element1.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element, next);
    }
}
