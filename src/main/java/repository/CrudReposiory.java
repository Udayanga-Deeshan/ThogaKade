package repository;

import java.util.List;

public interface CrudReposiory<T,ID> extends  SuperDao{

    boolean save(T entity);

    boolean update(T entity);

    boolean delete(ID id);

   T search(ID id);

    List<T> getAll();
}
