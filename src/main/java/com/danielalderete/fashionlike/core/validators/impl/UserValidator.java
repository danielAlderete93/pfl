package com.danielalderete.fashionlike.core.validators.impl;

import com.danielalderete.fashionlike.core.model.User;
import com.danielalderete.fashionlike.core.validators.Validator;
import com.danielalderete.fashionlike.core.validators.criterias.CriteriaValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserValidator extends Validator<User> {


    public UserValidator(List<CriteriaValidator<User>> criteriaValidators) {
        super(criteriaValidators);
    }
}
