package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Repository.OrganizationRepository;
import com.elm.tajseer.tajseer.Service.UserService;
import com.elm.tajseer.tajseer.dto.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userService ;
    @Autowired
    private OrganizationRepository organizationRepository ;


    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/AddUsers")
    public String addUsers(@RequestBody Users users){
        return userService.addUsers(users) ;
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
        return userService.getUser(userId);
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
