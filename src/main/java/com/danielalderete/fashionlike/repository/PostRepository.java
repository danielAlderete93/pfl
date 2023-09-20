package com.danielalderete.fashionlike.repository;

import com.danielalderete.fashionlike.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends GenericRepository<Post, Long> {
}
