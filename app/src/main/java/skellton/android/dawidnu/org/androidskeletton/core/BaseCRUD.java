package skellton.android.dawidnu.org.androidskeletton.core;

import java.util.List;

/**
 * Created by Daniel on 13.11.2014.
 */
public abstract interface BaseCRUD<T> {

    public T get(Long id);

    public List<T> getAll();

    public void delete(Long id);

    public T update(T model);

    public T save(T model);

}
