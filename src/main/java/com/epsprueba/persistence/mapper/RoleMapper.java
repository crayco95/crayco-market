package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.Role;
import com.epsprueba.persistence.entity.Rol;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mappings({
            @Mapping(source = "idRol", target = "roleId"),
            @Mapping(source = "nombreRol", target = "roleName"),
    })
    Role toRole(Rol rol);
    List<Role> toRole(List<Rol> rols);

    @InheritInverseConfiguration
    @Mapping(target = "usuarios", ignore = true)
    Rol toRol(Role role);
}
