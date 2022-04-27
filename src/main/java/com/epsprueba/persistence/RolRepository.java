package com.epsprueba.persistence;

import com.epsprueba.domain.Role;
import com.epsprueba.domain.repository.RoleRepository;
import com.epsprueba.persistence.crud.RolCrudRepository;
import com.epsprueba.persistence.entity.Rol;
import com.epsprueba.persistence.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolRepository implements RoleRepository {
    private RolCrudRepository rolCrudRepository;
    private RoleMapper mapper;

    @Override
    public List<Role> getAll(){
        List<Rol> rols = (List<Rol>) rolCrudRepository.findAll();
        return mapper.toRole(rols);
    }

    @Override
    public Optional<Role> getRole(int roleId) {
        return rolCrudRepository.findById(roleId).map(rol -> mapper.toRole(rol));
    }

    @Override
    public Role save(Role role) {
        Rol rol = mapper.toRol(role);
        return mapper.toRole(rolCrudRepository.save(rol));
    }

    @Override
    public void delete(int roleId){
        rolCrudRepository.deleteById(roleId);
    }
}
