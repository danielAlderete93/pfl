package com.danielalderete.fashionlike.core.validators;

import com.danielalderete.fashionlike.core.validators.criterias.CriteriaValidator;
import com.danielalderete.fashionlike.core.validators.criterias.NotNullCriteriaValidator;

import java.util.ArrayList;
import java.util.List;


public abstract class Validator<T> {
    protected List<CriteriaValidator<T>> criteriaValidators;

    protected Validator(List<CriteriaValidator<T>> criteriaValidators) {
        this.criteriaValidators = new ArrayList<>();
        this.criteriaValidators.add(new NotNullCriteriaValidator<>());
        this.criteriaValidators.addAll(criteriaValidators);
    }

    public void validate(T value) {
        criteriaValidators.forEach(tCriteriaValidator -> tCriteriaValidator.validate(value));
    }


}
