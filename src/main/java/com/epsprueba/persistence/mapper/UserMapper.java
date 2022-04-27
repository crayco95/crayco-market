package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.User;
import com.epsprueba.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombreUsuario", target = "userName"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "idRol", target = "roleId"),
            @Mapping(source = "rol", target = "role"),

    })
    User toUser(Usuario usuario);
    List<User> toUser(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
