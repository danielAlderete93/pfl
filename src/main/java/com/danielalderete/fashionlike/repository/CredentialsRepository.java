package com.danielalderete.fashionlike.repository;

import com.danielalderete.fashionlike.model.Credentials;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends GenericRepository<Credentials, Long> {
}
