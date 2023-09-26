package com.danielalderete.fashionlike.core.validators.factories;

import com.danielalderete.fashionlike.core.validators.Validator;

public interface ValidatorFactory<T> {

    Validator<T> createForCreate();
    Validator<T> createForUpdate();
}
