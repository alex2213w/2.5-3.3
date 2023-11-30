public class MyStack {
    private MyLinkedList list;

    public MyStack(MyLinkedList list) {
        this.list = list;
    }
    public void push(Integer element) {

        list.addFirst(element);
    }

    public Integer pop() {
        return list.removeFirst();
    }
}
