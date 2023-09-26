package com.danielalderete.fashionlike.api.usecases.impl;

import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.service.GenericService;
import com.danielalderete.fashionlike.api.usecases.GenericUseCases;

import java.util.List;

public abstract class AbstractGenericCrudUseCases<SERVICE extends GenericService<MODEL, ID>, MODEL, REQ, RES, ID> implements GenericUseCases<REQ, RES, ID> {

    protected abstract Mapper<MODEL, REQ> getMapperRequest();

    protected abstract Mapper<MODEL, RES> getMapperResponse();

    protected abstract SERVICE getService();

    @Override
    public RES create(REQ REQ) {
        MODEL model = getMapperRequest().toModel(REQ);

        MODEL modelCreated = this.getService().create(model);

        return getMapperResponse().toDTO(modelCreated);
    }

    @Override
    public RES update(REQ REQ, ID id) {
        MODEL modelToEdit = getMapperRequest().toModel(REQ);

        MODEL modelUpdated = this.getService().update(modelToEdit, id);

        return getMapperResponse().toDTO(modelUpdated);
    }

    @Override
    public RES findById(ID id) {
        MODEL modelFounded = this.getService().getById(id);
        if (modelFounded == null) {
            return null;
        }
        return getMapperResponse().toDTO(modelFounded);

    }

    @Override
    public List<RES> findAll() {
        List<MODEL> modelList = this.getService().getAll();

        return modelList.stream().map(model -> getMapperResponse().toDTO(model)).toList();
    }

    @Override
    public boolean delete(ID id) {
        return this.getService().delete(id);
    }


}
