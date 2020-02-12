package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplimentation implements UserService {

@Autowired
private UserRepository userRepository ;


    @Override
    public String addUser(Users users) {
        userRepository.save(users);
        return "User added Successfully";
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getUser(int userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public Users updateUser(Users users, int userId) {
        users.setUserId(userId);
        return userRepository.save(users);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

}
