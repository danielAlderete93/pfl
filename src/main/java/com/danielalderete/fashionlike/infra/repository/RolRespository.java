package com.danielalderete.fashionlike.infra.repository;

import com.danielalderete.fashionlike.core.model.Rol;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRespository extends GenericRepository<Rol, Long> {
}
