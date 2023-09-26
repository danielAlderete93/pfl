package com.danielalderete.fashionlike.core.validators.impl;

import com.danielalderete.fashionlike.core.model.Reaction;
import com.danielalderete.fashionlike.core.validators.Validator;
import com.danielalderete.fashionlike.core.validators.criterias.CriteriaValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReactionValidator extends Validator<Reaction> {


    public ReactionValidator(List<CriteriaValidator<Reaction>> criteriaValidators) {
        super(criteriaValidators);
    }
}
