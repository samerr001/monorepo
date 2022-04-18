package com.samerDailyCoding.userservice.controller;

import com.samerDailyCoding.userservice.dto.UserDepartmentDTO;
import com.samerDailyCoding.userservice.entity.User;
import com.samerDailyCoding.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser( @RequestBody User user) {
        log.info("Indise method saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserDepartmentDTO getUserWithDepartment(@PathVariable("id") Long userId) {
        return userService.getUserWithDepartment(userId);
    }
}
