package com.danielalderete.fashionlike.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "feeds")
@Builder
public class Reaction implements Identificable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private User user;
    @Column(name = "like", nullable = true)
    private Boolean like;
    @Column
    private String description;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "update_date")
    private Date updatedDate;

}

