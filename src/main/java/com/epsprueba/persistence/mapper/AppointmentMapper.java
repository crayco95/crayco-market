package com.epsprueba.persistence.mapper;

import com.epsprueba.domain.Appointment;
import com.epsprueba.persistence.entity.Cita;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ConsultoryMapper.class,PacientMapper.class})
public interface AppointmentMapper {
    @Mappings({
            @Mapping(source = "idCita", target = "appointmentId"),
            @Mapping(source = "idPaciente", target = "pacientId"),
            @Mapping(source = "idConsultorio", target = "consultoryId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "hora", target = "hour"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "medicamentos", target = "medicines"),
            @Mapping(source = "diagnostico", target = "diagnosis"),
            @Mapping(source = "motivoCancelacion", target = "cancellationReason"),
            @Mapping(source = "consultorio", target = "consultory"),
            @Mapping(source = "paciente", target = "pacient"),
    })
    Appointment toAppointment(Cita cita);

    @InheritInverseConfiguration
    Cita toCita(Appointment appointment);
}
