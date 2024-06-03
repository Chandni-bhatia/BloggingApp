package com.BloggingApp.Talkies.users;

import com.BloggingApp.Talkies.users.userdtos.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UsersRepository usersRepository;

   public  UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void createUser(CreateUserRequest req) {
       var user = UserEntity.builder().username(req.getUsername()).email(req.getEmail()).password(req.getPassword()).build();
       usersRepository.save(user);
    }

    public void getUser(CreateUserRequest req) throws Exception {
     UserEntity user = usersRepository.findByEmail(req.getEmail());
     if(user == null){
         throw new Exception("InValidUserException");
     }
    }


}
