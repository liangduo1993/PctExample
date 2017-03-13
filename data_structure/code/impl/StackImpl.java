package impl;

import api.StackInterface;

import java.util.EmptyStackException;

/**
 * Created by ERIC_LAI on 2017-03-12.
 */
public class StackImpl<E> implements StackInterface<E> {

    private int top;
    private int capacity;
    private Object[] stack;

    public StackImpl() {
        stack = new Object[5];
        this.capacity = 5;
    }

    public StackImpl(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void push(E item) {

        // if need to expand the array
        if (top == capacity - 1) {
            // create a new array with double size
            Object[] doubleStack = new Object[this.capacity * 2];
            // copy all elements from the old array to the new one
            System.arraycopy(stack, 0, doubleStack, 0, stack.length);
            // update the stack pointer to the new array
            stack = doubleStack;
            // update the capacity variable
            this.capacity *= 2;

            // debug information
            System.out.println("Trigger capacity double operation ...");
            System.out.println("Current capacity: " + this.capacity / 2);
            System.out.println("New capacity: " + stack.length);
            System.out.println("The trigger operation happened when insert: " + item);
            System.out.println();
            // end of debug information
        }

        // add the new element into the stack
        stack[++top] = item;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E pop() {
        if (top >= 0) {
            Object tmp = stack[top];
            this.top--;

            // if need to shrink the array
            if (top < this.capacity / 4) {
                // create a new array with half size
                Object[] halfStack = new Object[this.capacity / 2];
                // copy all elements from the old array to the new one
                System.arraycopy(stack, 0, halfStack, 0, top + 1);
                // update the stack pointer to the new array
                stack = halfStack;
                // update the capacity variable
                this.capacity /= 2;

                // debug information
                System.out.println("Trigger capacity shrink operation ...");
                System.out.println("Current capacity: " + this.capacity * 2);
                System.out.println("New capacity: " + stack.length);
                System.out.println("The shrink operation happened when remove: " + tmp);
                System.out.println();
                // end of debug information
            }

            return (E) tmp;
        } else {
            throw new EmptyStackException();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E peek() {
        if (top >= 0) {
            return (E) stack[top];
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

}
