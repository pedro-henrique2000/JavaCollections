package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();

        // para manipular stack, sempre utilizar os metodos push ou pop.

        numberStack.push(123L);
        System.out.println("pushed 123L");
        printStack(numberStack);

        numberStack.push(1);
        System.out.println("pushed 1");
        printStack(numberStack);

        System.out.printf("top item: %d%n", numberStack.peek());

        numberStack.push(36);
        System.out.println("pushed 36");
        printStack(numberStack);

        numberStack.push(2);
        System.out.println("pushed 2");
        printStack(numberStack);

        try {
            Number removedObject = null;

            while(true) {
                removedObject = numberStack.pop();
                System.out.printf("removed %d%n", removedObject);
                printStack(numberStack);
            }
        } catch (EmptyStackException exception) {
            exception.printStackTrace();
        }
    }

    private static void printStack(Stack<Number> stack) {
        if(stack.isEmpty())
            System.out.println("stack is empty");
        else
            System.out.printf("stack contains: (top) %s%n", stack);

    }
}
