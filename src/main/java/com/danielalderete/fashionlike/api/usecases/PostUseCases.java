package com.danielalderete.fashionlike.api.usecases;

import com.danielalderete.fashionlike.api.dtos.req.PostRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.PostResponseDTO;

public interface PostUseCases extends GenericUseCases<PostRequestDTO, PostResponseDTO, Long> {
}
