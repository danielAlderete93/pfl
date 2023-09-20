package com.danielalderete.fashionlike.mappers;

public interface Mapper<MODEL, DTO> {
    DTO toDTO(MODEL model);

    MODEL toModel(DTO dto);
}
