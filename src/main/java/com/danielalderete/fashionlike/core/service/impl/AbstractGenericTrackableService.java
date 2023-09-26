package com.danielalderete.fashionlike.core.service.impl;

import com.danielalderete.fashionlike.core.model.IdentificableAndTrackable;
import com.danielalderete.fashionlike.infra.repository.GenericRepository;
import com.danielalderete.fashionlike.core.service.GenericService;
import com.danielalderete.fashionlike.core.validators.Validator;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public abstract class AbstractGenericTrackableService<MODEL extends IdentificableAndTrackable<ID>, ID> implements GenericService<MODEL, ID> {

    protected abstract GenericRepository<MODEL, ID> getRepository();

    protected abstract Validator<MODEL> getValidator();

    @Override
    public MODEL create(MODEL modelToCreate) {
        MODEL modelCreated;

        getValidator().validate(modelToCreate);


        modelToCreate.setCreatedDate(new Date());
        modelToCreate.setUpdatedDate(new Date());
        modelToCreate.setActive(true);
        modelCreated = getRepository().save(modelToCreate);


        return modelCreated;
    }

    @Override
    public MODEL update(MODEL model, ID id) {
        Optional<MODEL> modelToEdit = getRepository().findById(id);

        getValidator().validate(model);

        if (modelToEdit.isEmpty()) {
            return null;
        }

        model.setId(id);
        model.setUpdatedDate(new Date());

        return getRepository().save(model);
    }

    @Override
    public MODEL getById(ID id) {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public List<MODEL> getAll() {
        return getRepository().findAll();
    }

    @Override
    public boolean delete(ID id) {
        Optional<MODEL> modelToDelete = getRepository().findById(id);
        if (modelToDelete.isEmpty()) {
            return false;
        }

        getRepository().delete(modelToDelete.get());

        return getRepository().findById(id).isEmpty();
    }


}
