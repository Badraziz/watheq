package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.dto.UsersDto;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserService {

    public String addUsers(Users users);
    public String addOrganization(Organization organization);
    Organization findByOrganizationName(String organizationName);
    public UsersDto getUser(int userId);
    public List<UsersDto> getAllUsers();
    public Users updateUser(Users users, int userID);
    public void deleteUser(int userId);
    public void deleteAllUsers();
}
