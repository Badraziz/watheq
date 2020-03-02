package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.OrganizationRepository;
import com.elm.tajseer.tajseer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userservice ;
    @Autowired
    private OrganizationRepository organizationRepository ;


    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/AddIndividual")
    public String addIndividual(@RequestBody Users users){
        return userservice.addIndividual(users) ;
    }

    @PostMapping(value = "/AddOrganization")
    public String addOrganization(@RequestBody Organization organization){
        return userservice.addOrganization(organization) ;
    }

    @GetMapping(value = "/AddUserOfOrganization/{organizationName}")
    public Organization findOrganization2(@PathVariable("organizationName")  String organizationName){
        return userservice.findByOrganizationId(organizationName) ;
    }
    @GetMapping(value = "/GetAllUsers")
    public List<Users> getAllUsers() {
        return userservice.getAllUsers();
    }

    @PutMapping(value = "/UpdateUser/{userId}")
    public Users updateUser(@RequestBody Users users, @PathVariable("userId") int userId) {
        return userservice.updateUser(users, userId);
    }

    @DeleteMapping(value = "/DeleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userservice.deleteUser(userID);
    }

//    @RequestMapping(value="/login", method = RequestMethod.GET)
//    public String login(Model model, String error, String logout) {
//        if (error != null)
//            model.addAttribute("error", "Your username and password is invalid.");
//        if (logout != null)
//            model.addAttribute("message", "You have been logged out successfully.");
//        return "Login";
//    }

//    @GetMapping("/registration")
//    public String registration(Model model ){
//        model.addAttribute("userForm", new Users());
//        return "registration" ;
//    }

}
