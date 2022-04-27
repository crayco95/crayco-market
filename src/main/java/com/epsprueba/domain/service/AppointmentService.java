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
    public boolean delete(int appointmentId){
        return getAppointment(appointmentId).map(appointment -> {
            appointmentRepository.delete(appointmentId);
            return true;
        }).orElse( false);
    }
}
