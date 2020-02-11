package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Users;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserService {

    public String addUser(Users users);
    public List<Users> getAllUsers();
}
