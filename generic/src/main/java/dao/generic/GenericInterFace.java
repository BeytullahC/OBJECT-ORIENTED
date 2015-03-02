package dao.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public interface GenericInterFace<T> {

    public void insert(T t) throws Exception ;

    public T update(T t) throws Exception ;

    public void delete(T t) throws Exception;

    public List<T> findAll();

    public T findById(Object t);
}
