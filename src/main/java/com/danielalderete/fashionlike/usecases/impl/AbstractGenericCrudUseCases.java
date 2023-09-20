package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.service.GenericService;
import com.danielalderete.fashionlike.usecases.GenericUseCases;

import java.util.List;

public abstract class AbstractGenericCrudUseCases<SERVICE extends GenericService<MODEL, ID>, MODEL, DTO, ID> implements GenericUseCases<DTO, ID> {

    protected abstract Mapper<MODEL, DTO> getMapper();

    protected abstract SERVICE getService();

    @Override
    public DTO create(DTO dto) {
        MODEL model = getMapper().toModel(dto);

        MODEL modelCreated = this.getService().create(model);

        return getMapper().toDTO(modelCreated);
    }

    @Override
    public DTO update(DTO dto, ID id) {
        MODEL modelToEdit = getMapper().toModel(dto);

        MODEL modelCreated = this.getService().update(modelToEdit, id);

        return getMapper().toDTO(modelCreated);
    }

    @Override
    public DTO findById(ID id) {
        MODEL modelFounded = this.getService().getById(id);
        if (modelFounded == null) {
            return null;
        }
        return this.getMapper().toDTO(modelFounded);

    }

    @Override
    public List<DTO> findAll() {
        List<MODEL> modelList = this.getService().getAll();

        return modelList.stream().map(model -> getMapper().toDTO(model)).toList();
    }

    @Override
    public boolean delete(ID id) {
        return this.getService().delete(id);
    }


}
