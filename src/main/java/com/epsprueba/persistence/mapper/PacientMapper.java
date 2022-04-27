package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.Pacient;
import com.epsprueba.persistence.entity.Paciente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserPacientMapper.class, AppointmentMapper.class})
public interface PacientMapper {
    @Mappings({
            @Mapping(source = "idPaciente", target = "pacientId"),
            @Mapping(source = "idUsuarioPaciente", target = "userPacientId"),
            @Mapping(source = "nombrePaciente", target = "namePacient"),
            @Mapping(source = "apellidoPaciente", target = "lastNamePacient"),
            @Mapping(source = "celularPaciente", target = "cellPhonePacient"),
            @Mapping(source = "direccionPaciente", target = "adressPacient"),
            @Mapping(source = "cedulaPaciente", target = "pacientIdCard"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "usuarioPaciente", target = "userPacient"),
    })
    Pacient toPacient(Paciente paciente);

    @InheritInverseConfiguration
    @Mapping(target = "citas", ignore = true)
    Paciente toPaciente(Pacient pacient);
}
