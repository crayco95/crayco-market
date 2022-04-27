package com.epsprueba.domain.service;

import com.epsprueba.domain.Role;
import com.epsprueba.domain.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAll(){
        return roleRepository.getAll();
    }
    public Optional<Role> getRole(int roleId){
        return roleRepository.getRole(roleId);
    }
    public Role save(Role role){
        return roleRepository.save(role);
    }
    public boolean delete(int roleId){
        return getRole(roleId).map(role -> {
            roleRepository.delete(roleId);
            return true;
        }).orElse( false);
    }
}
