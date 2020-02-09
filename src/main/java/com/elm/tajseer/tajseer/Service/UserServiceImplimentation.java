package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplimentation implements UserService {

@Autowired
private UserRepository userRepository ;


    @Override
    public String addUser(Users users) {
        userRepository.save(users);
        return "Student added Successfully";
    }
}
