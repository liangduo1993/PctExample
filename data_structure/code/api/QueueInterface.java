package api;

/**
 * Created by ERIC_LAI on 2017-03-07.
 */
public interface QueueInterface<E> {

    void enqueue(E item);

    E dequeue();

    E peek();

    boolean isEmpty();
}
