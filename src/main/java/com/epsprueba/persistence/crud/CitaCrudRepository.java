package com.epsprueba.persistence.crud;

import com.epsprueba.persistence.entity.Cita;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CitaCrudRepository extends CrudRepository <Cita, Integer> {
    List<Cita> findByIdCitaOrderByIdCitaAsc(int idCita);
    List<Cita> findByIdPacienteOrderByIdCitaAsc(int idPaciente);
    List<Cita> findByIdConsultorioOrderByIdCitaAsc(int idConsultorio);
    List<Cita> findByFechaOrderByIdCitaAsc(Date fecha);
}
