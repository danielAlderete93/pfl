package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.Rol;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.repository.RolRespository;
import com.danielalderete.fashionlike.service.RolService;
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
}
