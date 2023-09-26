package com.danielalderete.fashionlike.core.validators.criterias;

public interface CriteriaValidator<T> {

    default void validate(T t) {
        if (!isValidate(t)) {
            action(t);
        }
    }

    void action(T t);

    boolean isValidate(T t);
}
