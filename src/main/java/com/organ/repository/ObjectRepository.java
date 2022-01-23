package com.organ.repository;

public interface ObjectRepository<T> {

    public void store(T t);

    public T retrieve(String name);

    public T search(String name);

    public T delete(String name);
}
