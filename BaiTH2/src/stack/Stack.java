package stack;

public class Stack implements InStack {

    private int maxSize;
    private int[] stackArray; //mảng các phần tử trong stack
    private int top; //phần tử đầu tiên
    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void push(int j) {
        stackArray[++top] = j;
    }

    @Override
    public int pop() {
        return stackArray[top--];
    }

    @Override
    public int peek() {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == (maxSize - 1));
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
