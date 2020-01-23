package com.bank.repository;

import com.bank.repository.impl.Pageable;

import java.util.List;

public interface CrudRepository<E> {
    //creat
    void save(E entity);

    //read
    E findById(Integer id);

    List<E> findAll(int page, int itemsPerPage);

    default Pageable<E> findAll(Page page){
        return null;
    }
    //update

    void update(E entity);

    //
    void deleteById(Integer id);
}
