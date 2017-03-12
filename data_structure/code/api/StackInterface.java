package api;

/**
 * Created by ERIC_LAI on 2017-03-07.
 */
public interface StackInterface<E> {

    void push(E item);

    E pop();

    E peek();

    boolean isEmpty();

    void setCapacity(int capacity);
}
