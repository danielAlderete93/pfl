package com.danielalderete.fashionlike.api.usecases.impl;


import com.danielalderete.fashionlike.api.dtos.req.UserRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.UserResponseDTO;
import com.danielalderete.fashionlike.api.usecases.UserUseCases;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.User;
import com.danielalderete.fashionlike.core.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserUseCasesImpl extends AbstractGenericCrudUseCases<UserService, User, UserRequestDTO, UserResponseDTO, Long> implements UserUseCases {
    private Mapper<User, UserRequestDTO> mapperRequest;
    private Mapper<User, UserResponseDTO> mapperResponse;
    private UserService userService;

    @Override
    protected Mapper<User, UserRequestDTO> getMapperRequest() {
        return this.mapperRequest;
    }

    @Override
    protected Mapper<User, UserResponseDTO> getMapperResponse() {
        return mapperResponse;
    }

    @Override
    protected UserService getService() {
        return userService;
    }
}


