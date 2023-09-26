package com.danielalderete.fashionlike.core.validators.criterias;

import com.danielalderete.fashionlike.core.exceptions.InvalidAuthorException;
import com.danielalderete.fashionlike.core.model.Post;

public class AuthorValidator implements CriteriaValidator<Post> {
    @Override
    public void action(Post post) {
        throw new InvalidAuthorException();
    }

    @Override
    public boolean isValidate(Post post) {
        return post.getAuthor() != null;
    }
}
