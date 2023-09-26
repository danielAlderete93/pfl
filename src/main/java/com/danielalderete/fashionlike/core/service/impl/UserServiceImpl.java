package com.danielalderete.fashionlike.core.service.impl;

import com.danielalderete.fashionlike.core.model.User;
import com.danielalderete.fashionlike.core.service.UserService;
import com.danielalderete.fashionlike.infra.repository.GenericRepository;
import com.danielalderete.fashionlike.infra.repository.UserRepository;
import com.danielalderete.fashionlike.core.validators.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractGenericTrackableService<User, Long> implements UserService {

    private final UserRepository userRepository;
    private final Validator<User> userValidator;



    @Override
    protected GenericRepository<User, Long> getRepository() {
        return userRepository;
    }

    @Override
    protected Validator<User> getValidator() {
        return userValidator;
    }
}
