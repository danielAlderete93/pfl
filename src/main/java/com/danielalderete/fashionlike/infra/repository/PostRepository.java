package com.danielalderete.fashionlike.infra.repository;

import com.danielalderete.fashionlike.core.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends GenericRepository<Post, Long> {
}
