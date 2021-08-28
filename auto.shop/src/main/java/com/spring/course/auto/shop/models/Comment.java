package com.spring.course.auto.shop.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.spring.course.auto.shop.models.ids.CommentId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @EmbeddedId
    private CommentId id = new CommentId();

    @ManyToOne(cascade = CascadeType.REMOVE)
    @MapsId("userId")
    @OrderBy("id DESC")
    private User user;

    @Column(name = "message")
    private String message;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REMOVE)
    @MapsId("announcementId")
    @OrderBy("id DESC")
    private Announcement announcement;
}
