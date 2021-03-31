package com.upgrad.backendst2.Controller;


import com.upgrad.backendst2.Model.User;
import com.upgrad.backendst2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/validate") //localhost:8080/ : post
    public String validate(Model model){
        User user = new User();
        model.addAttribute("User", user);
        return "index";
    }

    @RequestMapping(value="/validate", method= RequestMethod.POST)
    public String registerUser(User user){
        userService.registerUser(user);
        return "index";
    }
}
