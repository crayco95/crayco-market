package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.UserPacient;
import com.epsprueba.persistence.entity.UsuarioPaciente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserPacientMapper {
    @Mappings({
            @Mapping(source = "idUsuarioPaciente", target = "userPacientId"),
            @Mapping(source = "nombreUsuario", target = "userName"),
            @Mapping(source = "password", target = "password"),
    })
    UserPacient toUserPacient(UsuarioPaciente usuarioPaciente);
    List<UserPacient> toUserPacient

    @InheritInverseConfiguration
    UsuarioPaciente toUsuarioPaciente(UserPacient userPacient);
}
