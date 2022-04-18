package stack;

public class StackLinkList implements InStack {
    private Node top;
    private int size;
    public StackLinkList(int size) {
        this.size=size;
        this.top=null;
    }


    @Override
    public void push(int j) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        size--;
        Node node = new Node();
        node.setItem(j);
        node.setNext(top);
        top=node;
    }

    @Override
    public int pop() {
        int item = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            size++;
            item = top.getItem();
            top=(top).getNext();
            return item;
        }

    }

    @Override
    public int peek() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        else{
            return top.getItem();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return size == 0;
    }
}
