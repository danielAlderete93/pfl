package com.danielalderete.fashionlike.core.validators.impl;

import com.danielalderete.fashionlike.core.model.PostType;
import com.danielalderete.fashionlike.core.validators.Validator;
import com.danielalderete.fashionlike.core.validators.criterias.CriteriaValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostTypeValidator extends Validator<PostType> {


    public PostTypeValidator(List<CriteriaValidator<PostType>> criteriaValidators) {
        super(criteriaValidators);
    }
}
