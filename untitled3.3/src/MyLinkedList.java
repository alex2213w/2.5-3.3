public class MyLinkedList {
    private Element last;
    private Element first;
    private int size;

    public void add(Integer e) {
        Element newNode = new Element(e);
        if (size == 0) {
            first = last = newNode;
        } else {
            last.next = new Element(e);
            last = newNode;
        }
        size++;
    }

    public void add(int index, Integer element) {
        Element newElement = new Element(element);
        if (first == null) {
            first = last = newElement;
        } else if (index == 0) {
            newElement.next = first;
            first = newElement;
        } else if (index == size) {
            last.next = newElement;
            last = newElement;
        } else {
            Element current = getIndex(index - 1);
            newElement.next = current.next;
            newElement.next = newElement;
        }
        size++;
    }

    public void addFirst(Integer e) {
        add(0, e);
        size++;
    }

    public void addLast(Integer e) {
        add(size, e);
        size++;
    }

    public Integer get(int index) {
        return getIndex(index).element;
    }

    private Element getIndex(int index) {
        Element current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Integer getFirst() {
        return get(0);
    }

    public Integer getLast() {
        return last.getElement();
    }

    public Integer remove(int index) {
        Integer element;
        if (index == 0) {
            if (first == null) {
                last = null;
            }
            element = first.element;
            first = first.next;
        } else {
            Element removerdElement = getIndex(index - 1);
            element = removerdElement.next.element;
            removerdElement.next = removerdElement.next.next;
            if (index == size - 1) {
                last = removerdElement;
            }
        }
        size--;
        return element;
    }

    public Integer removeFirst() {
        return remove(0);
    }

    public Integer removeLast() {
        return remove(size - 1);
    }

    public void set(int index, Integer e) {
        Element element = getIndex(index);
        element.element = e;
    }

    public int size() {
        return size;
    }

    public int indexOf(Integer e) {
        Element current = first;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(e)) {
                return i;
            }
        }
        return -1;
    }

}
