package dao.generic;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public abstract class AbstractDao<T> {

    protected abstract Connection getConnection();

    public void insert(T t) throws Exception {
        System.out.println("insert called.." + t.getClass());
    }

    public T update(T t) throws Exception {
        System.out.println("update called.." + t.getClass());
        return t;
    }

    public void delete(T t) throws Exception {
        System.out.println("delete called.." + t.getClass());

    }

    public List<T> findAll() {
        System.out.println("findAll called..");
        return new ArrayList<T>();
    }

    public T findById(Object t) {
        System.out.println("findById called.." + t.getClass());
        try {
            return (T) t;
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return null;
    }
}
