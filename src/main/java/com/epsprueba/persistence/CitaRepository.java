package com.epsprueba.persistence;

import com.epsprueba.persistence.crud.CitaCrudRepository;
import com.epsprueba.persistence.entity.Cita;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class CitaRepository {
    private CitaCrudRepository citaCrudRepository;
    public List<Cita>getAll(){
        return (List<Cita>) citaCrudRepository.findAll();
    }
    public List<Cita> getByIdCita(int idCita){
        return citaCrudRepository.findByIdCitaOrderByIdCitaAsc(idCita);
    }
    public List<Cita> getByIdPaciente(int idPaciente){
        return citaCrudRepository.findByIdPacienteOrderByIdCitaAsc(idPaciente);
    }
    public List<Cita> getByIdConsultorio(int idConsultorio){
        return citaCrudRepository.findByIdConsultorioOrderByIdCitaAsc(idConsultorio);
    }
    public List<Cita> getByFecha(Date fecha){
        return citaCrudRepository.findByFechaOrderByIdCitaAsc(fecha);
    }
    public Optional<Cita> getCita(int idCita){
        return citaCrudRepository.findById(idCita);
    }
    public Cita save(Cita cita){
        return citaCrudRepository.save(cita);
    }
    public void delete(int idCita){
        citaCrudRepository.deleteById(idCita);
    }
}
