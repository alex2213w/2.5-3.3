public class MyQueue {
    private MyLinkedList list;

    public MyQueue() {
        this.list = new MyLinkedList();
    }

    public void offer(Integer element) {
        list.addLast(element);
    }

    public Integer peek() {
        return list.getFirst();
    }

    public Integer poll() {
        return list.removeFirst();
    }
}