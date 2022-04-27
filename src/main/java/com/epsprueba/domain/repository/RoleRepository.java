package com.epsprueba.domain.repository;

import com.epsprueba.domain.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository{
    List<Role> getAll();
    Optional<Role> getRole(int roleId);
    Role save(Role role);
    void delete(int roleId);
}
