package api;

import java.util.List;

/**
 * Created by ERIC_LAI on 2017-03-07.
 */
public interface GraphService<E> {

    List<E> dfs(E vertex);

    List<E> bfs(E vertex);
}
