package com.danielalderete.fashionlike.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class PostUserKey implements Serializable {

    @ManyToOne
    private Post post;


    @ManyToOne
    private User user;
}
