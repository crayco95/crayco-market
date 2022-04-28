package com.epsprueba.web.controller;

import com.epsprueba.domain.Role;
import com.epsprueba.domain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rols")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("/all")
    public List<Role> getAll(){
        return roleService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Role> getRole(@PathVariable("id") int roleId){
        return roleService.getRole(roleId);
    }
    @PostMapping("/save")
    public Role save(@RequestBody Role role){
        return roleService.save(role);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody Role role, @PathVariable("id") int roleId){
        roleService.update(role, roleId);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int roleId){
        return roleService.delete(roleId);
    }
}
