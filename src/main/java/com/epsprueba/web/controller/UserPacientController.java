package com.epsprueba.web.controller;


import com.epsprueba.domain.UserPacient;
import com.epsprueba.domain.service.UserPacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userPacients/")
public class UserPacientController {
    @Autowired
    private UserPacientService userPacientService;
    @GetMapping("/all")
    public List<UserPacient> getAll(){
        return userPacientService.getAll();
    }
    @GetMapping("{id}")
    public Optional<UserPacient> getUserPacient(int userPacientId){
        return userPacientService.getUserPacient(userPacientId);
    }
    @PostMapping("/save")
    public UserPacient save(@RequestBody UserPacient userPacient){
        return userPacientService.save(userPacient);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody UserPacient userPacient, @PathVariable("id") int userPacientId){
        userPacientService.update(userPacient, userPacientId);
    }
    @DeleteMapping("delete/{id}")
    public boolean delete(int userPacientId){
        return userPacientService.delete(userPacientId);
    }

}
