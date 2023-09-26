package com.danielalderete.fashionlike.api.mappers;

public interface Mapper<MODEL, DTO> {
    DTO toDTO(MODEL model);

    MODEL toModel(DTO dto);
}
