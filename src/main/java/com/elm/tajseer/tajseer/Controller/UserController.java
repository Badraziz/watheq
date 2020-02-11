package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userservice ;

    @PostMapping(value = "/AddUser")
    public String addUser(@RequestBody Users users){
        return userservice.addUser(users) ;
    }

    @GetMapping(value = "/GetAllUsers")
    public List<Users> getAllUsers() {
        return userservice.getAllUsers();
    }
}
