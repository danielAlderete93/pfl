package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.dtos.req.ReactionRequestDTO;
import com.danielalderete.fashionlike.dtos.res.ReactionResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Reaction;
import com.danielalderete.fashionlike.service.ReactionService;
import com.danielalderete.fashionlike.usecases.ReactionUseCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReactionUseCasesImpl extends AbstractGenericCrudUseCases<ReactionService, Reaction, ReactionRequestDTO, ReactionResponseDTO, Long> implements ReactionUseCases {

    private Mapper<Reaction, ReactionRequestDTO> mapperRequest;
    private Mapper<Reaction, ReactionResponseDTO> mapperResponse;
    private ReactionService service;

    @Override
    protected Mapper<Reaction, ReactionRequestDTO> getMapperRequest() {
        return mapperRequest;
    }

    @Override
    protected Mapper<Reaction, ReactionResponseDTO> getMapperResponse() {
        return mapperResponse;
    }

    @Override
    protected ReactionService getService() {
        return service;
    }
}
