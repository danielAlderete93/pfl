package com.danielalderete.fashionlike.usecases.impl;


import com.danielalderete.fashionlike.dtos.req.UserDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.User;
import com.danielalderete.fashionlike.service.UserService;
import com.danielalderete.fashionlike.usecases.UserUseCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserUseCasesImpl extends AbstractGenericCrudUseCases<UserService, User, UserDTO, Long> implements UserUseCases {
    private Mapper<User, UserDTO> mapper;
    private UserService userService;

    @Override
    protected Mapper<User, UserDTO> getMapper() {
        return this.mapper;
    }

    @Override
    protected UserService getService() {
        return userService;
    }
}


