package com.BloggingApp.Talkies.comments;


import com.BloggingApp.Talkies.users.UserEntity;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name = "Comment")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    @Nonnull
    private Long id;

    @Column
    @Nullable
    private String title;

    @Column(nullable = false)
    @Nonnull
    private String body;

    @ManyToOne
    @JoinColumn(name = "articleId",nullable =false)
    private UserEntity article;

    @ManyToOne
    @JoinColumn(name = "authorId",nullable =false)
    private UserEntity author;

    @CreatedDate
    private Date createDate;

    //TODO: add tags

}
