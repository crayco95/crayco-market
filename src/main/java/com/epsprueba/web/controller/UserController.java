package com.epsprueba.web.controller;


import com.epsprueba.domain.User;
import com.epsprueba.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/rolId/{id}")
    public List<User> getByRoleId(@PathVariable("id") int roleId){
        return userService.getByRoleId(roleId);
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") int userId){
        return userService.getUser(userId);
    }
    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody User user, @PathVariable("id") int userId){
        userService.update(user, userId);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int userId){
        return userService.delete(userId);
    }
}
