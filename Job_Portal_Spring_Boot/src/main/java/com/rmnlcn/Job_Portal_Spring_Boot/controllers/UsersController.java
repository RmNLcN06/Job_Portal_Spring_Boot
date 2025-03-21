package com.rmnlcn.Job_Portal_Spring_Boot.controllers;

import com.rmnlcn.Job_Portal_Spring_Boot.entities.Users;
import com.rmnlcn.Job_Portal_Spring_Boot.entities.UsersType;
import com.rmnlcn.Job_Portal_Spring_Boot.services.UsersService;
import com.rmnlcn.Job_Portal_Spring_Boot.services.UsersTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersTypeService usersTypeService, UsersService usersService) {
        this.usersTypeService = usersTypeService;
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersTypes = usersTypeService.getAllUsersType();
        model.addAttribute("getAllUsersTypes", usersTypes);
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register/new")
    public String userRegistration(@Valid Users users, Model model) {
        // System.out.println("User: " + users);
        Optional<Users> optionalUsers = usersService.getUserByEmail(users.getEmail());

        if(optionalUsers.isPresent())
        {
            model.addAttribute("error", "Email already registered, try to login or register with other email.");
            List<UsersType> usersTypes = usersTypeService.getAllUsersType();
            model.addAttribute("getAllUsersTypes", usersTypes);
            model.addAttribute("user", new Users());
            return "register";
        }

        usersService.addNewUser(users);
        return "dashboard";
    }

}
