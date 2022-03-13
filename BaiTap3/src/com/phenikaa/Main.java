package com.phenikaa;

import static com.phenikaa.Point.Bai1;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(3, 5);
        Point p3 = new Point(5, 4);
        Point.Bai1(p1, p2, p3);


        stack stack = new stack(10);

        stack.push(1);
        stack.push(3);
        stack.push(10);
        stack.push(8);
        stack.push(5);

        System.out.println("Peek : "+ stack.peek());
        System.out.println("Pop : "+ stack.pop());

        stack theStack = new stack(10);
        theStack.push(1);
        theStack.push(3);
        theStack.push(9);
        theStack.push(5);
        theStack.push(6);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }

    }




}
