package com.organ.repository;

import com.organ.model.Player;

import java.util.List;

/**
 *
 * @param <T> The type of the main Object
 * @param <S> Type of the ID to detect an uniq record
 */
public interface ObjectRepository<T,S> {

    public T store(T t);

    public T retrieveById(S name);

    public S delete(S name);

    public List<T> getAll();
}
