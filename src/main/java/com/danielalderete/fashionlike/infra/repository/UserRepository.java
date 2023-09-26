package com.danielalderete.fashionlike.infra.repository;

import com.danielalderete.fashionlike.core.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
