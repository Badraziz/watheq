package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userservice ;

    @PostMapping("/addUser")
    public String addUser(@RequestBody Users users){
        return userservice.addUser(users) ;
    }
}
