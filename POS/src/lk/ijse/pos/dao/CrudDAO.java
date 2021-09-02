package lk.ijse.pos.dao;

import java.util.ArrayList;

public interface CrudDAO<T,ID> extends SuperDAO {
    boolean add (Object t ) throws Exception;

    boolean update (Object t ) throws Exception;

    boolean delete (Object id ) throws Exception;

    T search (Object id ) throws Exception;

    ArrayList< T > getAll ( ) throws Exception;
}
