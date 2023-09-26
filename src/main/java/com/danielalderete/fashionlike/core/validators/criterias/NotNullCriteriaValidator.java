package com.danielalderete.fashionlike.core.validators.criterias;

import com.danielalderete.fashionlike.core.exceptions.ExceptionMessages;

public class NotNullCriteriaValidator<T> implements CriteriaValidator<T> {
    @Override
    public void action(T t) {
        throw new IllegalArgumentException(ExceptionMessages.NOT_NULL);
    }

    @Override
    public boolean isValidate(T t) {
        return t != null;
    }
}
