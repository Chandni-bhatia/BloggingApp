package com.BloggingApp.Talkies.users;

import jakarta.validation.constraints.Null;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.web.JsonPath;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;


@DataJpaTest
//@ActiveProfiles("test")
//@AutoConfigureTestEntityManager
public class UserEntityTests {

    @Autowired
    UsersRepository repository;

    @Test
    public void create_user(){
      var user = UserEntity.builder().username("User1").email("user1@gmail.com").password("password").build();
      repository.save(user);
    }

    @Test
    public void fetch_users(){
        var user = UserEntity.builder().username("User1").email("user1@gmail.com").password("password").build();
        repository.save(user);
        var record = repository.findAll().stream().findFirst();
        Assertions.assertTrue(record.isPresent(), "The record didn't get saved");

    }

    @Test
    public void validate_user_creation(){
       try {
           var user = UserEntity.builder().username("User1").email("user1@gmail.com").build();
           repository.save(user);
       } catch(NullPointerException e) {
           var record = repository.findAll().stream().findFirst();
           Assertions.assertTrue(record.isEmpty(), "The record got saved without password");
       }
    }
}
