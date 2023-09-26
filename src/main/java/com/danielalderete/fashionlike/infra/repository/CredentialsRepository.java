package com.danielalderete.fashionlike.infra.repository;

import com.danielalderete.fashionlike.core.model.Credentials;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends GenericRepository<Credentials, Long> {
}
