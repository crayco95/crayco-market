package com.epsprueba.domain.service;

import com.epsprueba.domain.Appointment;
import com.epsprueba.domain.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAll(){
        return appointmentRepository.getAll();
    }
    public List<Appointment> getByAppointmentId(int appointmentId){
        return appointmentRepository.getByAppointmentId(appointmentId);
    }
    public List<Appointment> getByPacientId(int pacientId){
        return appointmentRepository.getByPacientId(pacientId);
    }
    public List<Appointment> getByConsultoryId(int consultoryId){
        return appointmentRepository.getByConsultoryId(consultoryId);
    }
    public List<Appointment> getByDate(Date date){
        return appointmentRepository.getByDate(date);
    }
    public Optional<Appointment> getAppointment(int appointmentId){
        return appointmentRepository.getAppointment(appointmentId);
    }
    public Appointment save(Appointment appointment){
        return appointmentRepository.save(appointment);
    }
    public Appointment update(Appointment appointment, int appointmentId) {
        return appointmentRepository.getAppointment(appointmentId)
                .map(appointment1 -> {
                    appointment1.setAppointmentId(appointment.getAppointmentId());
                    appointment1.setPacientId(appointment.getPacientId());
                    appointment1.setConsultoryId(appointment.getConsultoryId());
                    appointment1.setDate(appointment.getDate());
                    appointment1.setHour(appointment.getHour());
                    appointment1.setActive(appointment.isActive());
                    appointment1.setDiagnosis(appointment.getDiagnosis());
                    appointment1.setMedicines(appointment.getMedicines());
                    appointment1.setCancellationReason(appointment.getCancellationReason());
                    appointment1.setPacient(appointment.getPacient());
                    appointment1.setConsultory(appointment.getConsultory());
                    return appointmentRepository.save(appointment1);
                })
                .orElseGet(() -> {
                    appointment.setAppointmentId(appointmentId);
                    return appointmentRepository.save(appointment);
                });
    }
    public boolean delete(int appointmentId){
        return getAppointment(appointmentId).map(appointment -> {
            appointmentRepository.delete(appointmentId);
            return true;
        }).orElse( false);
    }
}
