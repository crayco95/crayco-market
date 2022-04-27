package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.Consultory;
import com.epsprueba.persistence.entity.Consultorio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DoctorMapper.class, AppointmentMapper.class})
public interface ConsultoryMapper {
    @Mappings({
            @Mapping(source = "idConsultorio", target = "consultoryId"),
            @Mapping(source = "idMedico", target = "doctorId"),
            @Mapping(source = "departamento", target = "departament"),
            @Mapping(source = "ciudad", target = "city"),
            @Mapping(source = "direccion", target = "adress"),
            @Mapping(source = "medico", target = "doctor"),


    })
    Consultory toConsultory(Consultorio consultorio);
    List<Consultory> toConsultory(List<Consultorio> consultorios);
    @InheritInverseConfiguration
    @Mapping(target = "citas", ignore = true)
    Consultorio toConsultorio(Consultory consultory);
}
