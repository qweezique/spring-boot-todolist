package com.toDoListApp.controller;

import com.toDoListApp.model.User;
import com.toDoListApp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/new")
    public String createNewUser(Model model) {
        model.addAttribute("user", new User());
        return "user/new";
    }

    @PostMapping("/new")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "user/show";
    }

    @GetMapping("/info")
    public String userInfo() {
        //TODO: Cookie?
        return "user/show";
    }
}
