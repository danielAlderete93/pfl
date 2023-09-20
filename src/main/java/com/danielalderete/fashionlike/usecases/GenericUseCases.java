package com.danielalderete.fashionlike.usecases;

import java.util.List;

public interface GenericUseCases<DTO, ID> {

    DTO create(DTO dto);

    DTO update(DTO dto, ID id);

    DTO findById(ID id);

    List<DTO> findAll();

    boolean delete(ID id);

}
