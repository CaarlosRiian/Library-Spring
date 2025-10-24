package com.librarySpring.library.controller;

import com.librarySpring.library.model.User;
import com.librarySpring.library.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search")
    public List<User> searchUsers(@RequestParam("name") String name) {
        return userService.searchUsersByName(name);
    }
}
