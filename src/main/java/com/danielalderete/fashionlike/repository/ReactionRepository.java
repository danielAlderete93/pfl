package com.danielalderete.fashionlike.repository;

import com.danielalderete.fashionlike.model.Reaction;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepository extends GenericRepository<Reaction, Long> {
}
