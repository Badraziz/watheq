package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Users;
import org.springframework.stereotype.Component;


@Component
public interface UserService {

    public String addUser(Users users);
}
