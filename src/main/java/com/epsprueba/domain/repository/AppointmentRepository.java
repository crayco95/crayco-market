package com.epsprueba.domain.repository;

import com.epsprueba.domain.Appointment;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface AppointmentRepository {
    List<Appointment> getAll();
    List<Appointment> getByAppointmentId(int appointmentId);
    List<Appointment> getByPacientId(int pacientId);
    List<Appointment> getByConsultoryId(int consultoryId);
    List<Appointment> getByDate(Date date);
    Optional<Appointment> getAppointment(int appointmentId);
    Appointment save(Appointment appointment);
    void delete(int appointmentId);
}
