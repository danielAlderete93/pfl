package com.danielalderete.fashionlike.usecases;

import java.util.List;

public interface GenericUseCases<REQ, RES, ID> {

    RES create(REQ dto);

    RES update(REQ dto, ID id);

    RES findById(ID id);

    List<RES> findAll();

    boolean delete(ID id);

}
