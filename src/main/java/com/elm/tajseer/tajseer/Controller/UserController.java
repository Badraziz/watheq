package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.OrganizationRepository;
import com.elm.tajseer.tajseer.Service.UserService;
import com.elm.tajseer.tajseer.dto.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/Users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService ;
    @Autowired
    private OrganizationRepository organizationRepository ;

    @GetMapping(value = "/Login")
    public ResponseEntity login(Principal principal){
        Map<String,String> map = new HashMap<>();
        map.put("userID", String.valueOf(userService.getUserByEmail(principal.getName()).getUserId()));
        map.put("fullName", String.valueOf(userService.getUserByEmail(principal.getName()).getFullName()));
        map.put("dob", String.valueOf(userService.getUserByEmail(principal.getName()).getDateOfBirth()));
        map.put("phoneNumber", String.valueOf(userService.getUserByEmail(principal.getName()).getPhoneNumber()));
        map.put("email", String.valueOf(userService.getUserByEmail(principal.getName()).getEmail()));
        return ResponseEntity.ok(map);
    }

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/AddUser")
    public String addUser(@RequestBody Users users){
        return userService.addUser(users) ;
    }

    @PostMapping(value = "/AddOrganization")
    public String addOrganization(@RequestBody Organization organization){
        return userService.addOrganization(organization) ;
    }
    @GetMapping(value = "/GetAllUsers")
    public List<UsersDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/GetUser/{userID}")
    public UsersDto getUser(@PathVariable("userID") int userId) {
        return userService.getUserByID(userId);
    }


    @PutMapping(value = "/UpdateUser/{userId}")
    public Users updateUser(@RequestBody Users users, @PathVariable("userId") int userId) {
        return userService.updateUser(users, userId);
    }

    @DeleteMapping(value = "/DeleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userService.deleteUser(userID);
    }

    @GetMapping(value = "/findOrganization/{organizationName}")
    public Organization findOrganization(@PathVariable("organizationName")  String organizationName){
        return userService.findByOrganizationName(organizationName) ;
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
