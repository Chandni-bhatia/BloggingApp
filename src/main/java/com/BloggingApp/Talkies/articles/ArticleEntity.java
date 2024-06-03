package com.BloggingApp.Talkies.articles;


import com.BloggingApp.Talkies.users.UserEntity;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name = "Article")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    @Nonnull
    private Long id;

    @Column(nullable = false)
    @Nonnull
    private String title;

    @Column
    @Nullable
    private String subtitle;

    @Column(nullable = false)
    @Nonnull
    private String body;


    @ManyToOne
    @JoinColumn(name = "authorId",nullable =false)
    private UserEntity author;

    @CreatedDate
    private Date createDate;

    //TODO: add tags

}
