package org.example.Repositories;

import java.util.List;

//generic Interface
//IRepository <T>
public interface IRepository <T> {
    public List<T> getAll();
    public T getBy(int id);
    public void create(T object);
    public void update(int id, T object);
    public void delete(int id);
}
