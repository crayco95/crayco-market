package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.Doctor;
import com.epsprueba.persistence.entity.Medico;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface DoctorMapper {
    @Mappings({
            @Mapping(source = "idMedico", target = "doctorId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombreMedico", target = "nameDoctor"),
            @Mapping(source = "apellidoMedico", target = "lastNameDoctor"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "estadoMedico", target = "active"),
            @Mapping(source = "usuario", target = "user")
    })
    Doctor toDoctor(Medico medico);

    @InheritInverseConfiguration
    Medico toMedico(Doctor doctor);
}
