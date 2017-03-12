package api;

import java.util.List;

/**
 * Created by ERIC_LAI on 2017-03-07.
 */
public interface LinkedListService<E> {

    void add(E item);

    void add(E item, int position);

    void addFirst(E item);

    void addLast(E item);

    E remove(int position);

    E removeFirst();

    E removeLast();

    E get(int position);

    List<E> reverse();
}
