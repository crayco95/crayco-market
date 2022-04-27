package com.epsprueba.persistence;

import com.epsprueba.domain.Appointment;
import com.epsprueba.domain.repository.AppointmentRepository;
import com.epsprueba.persistence.crud.CitaCrudRepository;
import com.epsprueba.persistence.entity.Cita;
import com.epsprueba.persistence.mapper.AppointmentMapper;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CitaRepository implements AppointmentRepository {
    private CitaCrudRepository citaCrudRepository;
    private AppointmentMapper mapper;
    public List<Appointment>getAll(){
        List<Cita> citas = (List<Cita>) citaCrudRepository.findAll();
        return mapper.toAppointment(citas);
    }

    @Override
    public List<Appointment> getByAppointmentId(int appointmentId) {
        List<Cita> citas = citaCrudRepository.findByIdCitaOrderByIdCitaAsc(appointmentId);
        return mapper.toAppointment(citas);
    }

    @Override
    public List<Appointment> getByPacientId(int pacientId) {
        List<Cita> citas = citaCrudRepository.findByIdPacienteOrderByIdCitaAsc(pacientId);
        return mapper.toAppointment(citas);
    }

    @Override
    public List<Appointment> getByConsultoryId(int consultoryId) {
        List<Cita> citas = citaCrudRepository.findByIdConsultorioOrderByIdCitaAsc(consultoryId);
        return mapper.toAppointment(citas);
    }

    @Override
    public List<Appointment> getByDate(Date date) {
        List<Cita> citas = citaCrudRepository.findByFechaOrderByIdCitaAsc(date);
        return mapper.toAppointment(citas);
    }

    @Override
    public Optional<Appointment> getAppointment(int appointmentId) {
        return citaCrudRepository.findById(appointmentId).map(cita -> mapper.toAppointment(cita));
    }

    @Override
    public Appointment save(Appointment appointment) {
        Cita cita = mapper.toCita(appointment);
        return mapper.toAppointment(citaCrudRepository.save(cita));
    }

    @Override
    public void delete(int appointmentId){
        citaCrudRepository.deleteById(appointmentId);
    }
}
