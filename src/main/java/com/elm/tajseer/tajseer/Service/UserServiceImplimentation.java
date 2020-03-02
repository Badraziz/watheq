package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.OrganizationRepository;
import com.elm.tajseer.tajseer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplimentation implements UserService {

@Autowired
private UserRepository userRepository ;
@Autowired
private OrganizationRepository organizationRepository ;

    @Override
    public String addIndividual(Users users) {
        userRepository.save(users);
        return "Individual added Successfully";
    }
    @Override
    public String addOrganization(Organization organization) {
        organizationRepository.save(organization);
        return "Orgnization added Successfully";
    }

    @Override
    public Organization findByOrganizationId(String organizationName) {
        return organizationRepository.findByOrganizationId(organizationName);
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
