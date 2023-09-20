package com.danielalderete.fashionlike.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "credentials")
public class Credentials implements Identificable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 30, nullable = false, unique = true)
    private String username;
    @Column(length = 30, nullable = false)
    private String password;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "update_date", nullable = false)
    private Date updatedDate;
    @Column(nullable = false)
    private Boolean active;
    @OneToOne()
    private User user;

}
