package com.danielalderete.fashionlike.core.validators.impl;

import com.danielalderete.fashionlike.core.model.Post;
import com.danielalderete.fashionlike.core.validators.Validator;
import com.danielalderete.fashionlike.core.validators.criterias.CriteriaValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostValidator extends Validator<Post> {
    public PostValidator(List<CriteriaValidator<Post>> criteriaValidators) {
        super(criteriaValidators);
    }
}
