package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.User;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.repository.UserRepository;
import com.danielalderete.fashionlike.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractGenericTrackableService<User, Long> implements UserService {

    private final UserRepository userRepository;


    @Override
    protected GenericRepository<User, Long> getRepository() {
        return userRepository;
    }
}
