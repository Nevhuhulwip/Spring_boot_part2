package com.Pfano.SpringbootPart2.controller;

import com.Pfano.SpringbootPart2.model.User;
import com.Pfano.SpringbootPart2.service.UserService;

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable long id)
    {
        System.out.println("Searching by ID  : " + id);
        return userService.getUser(id);
    }
}
