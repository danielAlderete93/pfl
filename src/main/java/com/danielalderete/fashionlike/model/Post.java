package com.danielalderete.fashionlike.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "posts")
@Builder
public class Post implements Identificable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column()
    private String imagePath;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "update_date", nullable = false)
    private Date updatedDate;
    @Column(nullable = false)
    private Boolean active;
    @ManyToOne()
    private User author;
    @OneToMany()
    private List<PostType> postType;


}
