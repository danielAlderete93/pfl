package com.danielalderete.fashionlike.infra.repository;

import com.danielalderete.fashionlike.core.model.PostType;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTypeRepository extends GenericRepository<PostType, Long> {
}
