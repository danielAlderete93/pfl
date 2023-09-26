package com.danielalderete.fashionlike.core.service;

import java.util.List;

public interface GenericService<MODEL, ID> {
    MODEL create(MODEL model);

    MODEL update(MODEL model, ID id);

    MODEL getById(ID id);

    List<MODEL> getAll();

    boolean delete(ID id);



}
