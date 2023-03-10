package org.example;

import java.util.List;

public interface IService<T> {
    public List<T> getAll();
    public T getBy(int id);
    public void create(T object);
    public void update(int id, T object);
    public void delete(int id);
}
