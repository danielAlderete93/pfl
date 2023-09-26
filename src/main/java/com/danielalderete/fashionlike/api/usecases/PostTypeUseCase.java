package com.danielalderete.fashionlike.api.usecases;

import com.danielalderete.fashionlike.api.dtos.req.PostTypeRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.PostTypeResponseDTO;

public interface PostTypeUseCase extends GenericUseCases<PostTypeRequestDTO, PostTypeResponseDTO, Long> {
}
