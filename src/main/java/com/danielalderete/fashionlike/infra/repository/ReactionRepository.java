package com.danielalderete.fashionlike.infra.repository;

import com.danielalderete.fashionlike.core.model.Reaction;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepository extends GenericRepository<Reaction, Long> {
}
