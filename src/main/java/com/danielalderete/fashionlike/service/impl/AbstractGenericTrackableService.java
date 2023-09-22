package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.IdentificableAndTrackable;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.service.GenericService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public abstract class AbstractGenericTrackableService<MODEL extends IdentificableAndTrackable<ID>, ID> implements GenericService<MODEL, ID> {

    protected abstract GenericRepository<MODEL, ID> getRepository();


    @Override
    public MODEL create(MODEL modelToCreate) {
        MODEL modelCreated;

        modelToCreate.setCreatedDate(new Date());
        modelToCreate.setUpdatedDate(new Date());
        modelToCreate.setActive(true);
        modelCreated = getRepository().save(modelToCreate);


        return modelCreated;
    }

    @Override
    public MODEL update(MODEL model, ID id) {
        Optional<MODEL> modelToEdit = getRepository().findById(id);

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
