package com.danielalderete.fashionlike.core.service.impl;

import com.danielalderete.fashionlike.core.model.Rol;
import com.danielalderete.fashionlike.infra.repository.GenericRepository;
import com.danielalderete.fashionlike.infra.repository.RolRespository;
import com.danielalderete.fashionlike.core.service.RolService;
import com.danielalderete.fashionlike.core.validators.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolServiceImpl extends AbstractGenericService<Rol, Long> implements RolService {
    private final RolRespository rolRespository;


    @Override
    protected GenericRepository<Rol, Long> getRepository() {
        return null;
    }

    @Override
    protected Validator<Rol> getValidator() {
        return null;
    }
}
