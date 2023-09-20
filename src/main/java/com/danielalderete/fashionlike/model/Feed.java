package com.danielalderete.fashionlike.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "feeds")
@Builder
public class Feed implements Identificable<PostUserKey> {
    @EmbeddedId
    private PostUserKey id;
    private Boolean like;
    private Boolean viewed;
    private String description;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "update_date")
    private Date updatedDate;

    public Long getUserId() {
        return id.getUser().getId();
    }

    public Long getPostId() {
        return id.getPost().getId();
    }
}
