package api;

import java.util.List;

/**
 * Created by ERIC_LAI on 2017-03-07.
 */
public interface TreeService<E> {

    List<E> preOrder(E root);

    List<E> inOrder(E root);

    List<E> postOrder(E root);

    List<E> getDescendant(E root);

    List<E> getAncestor(E root);
}
