package com.danielalderete.fashionlike.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
@Builder
public class User implements IdentificableAndTrackable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @OneToMany()
    private List<Rol> roles;
    @Column(name = "image_path")
    private String imagePath;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "update_date", nullable = false)
    private Date updatedDate;
    @Column(name = "active", nullable = false)
    private Boolean active;
}
