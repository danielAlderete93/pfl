package com.danielalderete.fashionlike.repository;

import com.danielalderete.fashionlike.model.Feed;
import com.danielalderete.fashionlike.model.PostUserKey;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends GenericRepository<Feed, PostUserKey> {
}
