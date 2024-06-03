package com.BloggingApp.Talkies.users;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name = "Users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    Long id;

    @Column(nullable = false)
    @Nonnull
    String username;

    @Column(nullable = false)
    @Nonnull
    String email;

    @Column(nullable = false)
    @Nonnull
    String password;

    @Column(nullable = true)
    @Nullable
    String bio;

    @Column(nullable = true)
    @Nullable
    String image;

    @CreatedDate
    private Date createDate;
}
