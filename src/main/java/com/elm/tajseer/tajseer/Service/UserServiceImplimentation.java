package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.OrganizationRepository;
import com.elm.tajseer.tajseer.Repository.UserRepository;
import com.elm.tajseer.tajseer.dto.ObjectMapperUtils;
import com.elm.tajseer.tajseer.dto.UsersDto;
import org.modelmapper.ModelMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplimentation implements UserService {

@Autowired
public UserRepository userRepository ;
@Autowired
public OrganizationRepository organizationRepository ;
@Autowired
public ModelMapper modelMapper;

    @Override
    public String addUser(Users users) {
        users.setPassword(new BCryptPasswordEncoder().encode(users.getPassword()));
        userRepository.save(users);
        return "Individual added Successfully";
    }
    @Override
    public String addOrganization(Organization organization) {
        organizationRepository.save(organization);
        return "Orgnization added Successfully";
    }

    public UsersDto getUser(int userId) {
        Users users = userRepository.findById(userId).get();
        UsersDto userDTO = modelMapper.map(users, UsersDto.class);
        return userDTO;
    }


    @Override
    public UsersDto getUserByID(int userID) {
        Users users = userRepository.findById(userID).get();
        UsersDto usersDto = modelMapper.map(users, UsersDto.class);
        return usersDto;
    }

    @Override
    public UsersDto getUserByEmail(String email) {
        Users users =  userRepository.findByEmail(email);
        UsersDto usersDto = modelMapper.map(users, UsersDto.class);
        return usersDto;
    }
    @Override
    public Organization findByOrganizationName(String organizationName) {
        return organizationRepository.findByOrganizationName(organizationName);
    }

    @Override
    public List<UsersDto> getAllUsers() {
        List<Users> users = userRepository.findAll();
        List<UsersDto> usersDto = ObjectMapperUtils.mapAll(users,UsersDto.class);
        return usersDto;
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

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
