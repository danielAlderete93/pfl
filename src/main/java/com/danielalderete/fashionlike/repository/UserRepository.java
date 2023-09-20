package com.danielalderete.fashionlike.repository;

import com.danielalderete.fashionlike.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
