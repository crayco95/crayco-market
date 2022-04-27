package com.epsprueba.persistence.crud;

import com.epsprueba.persistence.entity.Consultorio;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ConsultorioCrudRepository extends CrudRepository<Consultorio, Integer> {

    List<Consultorio> findByIdConsultorioOrderByIdConsultorioAsc(int idConsultorio);

    List<Consultorio>findByIdMedicoOrderByIdConsultorioAsc(int idMedico);

    List<Consultorio> findByDepartamentoAndCiudad(String departamento, String ciudad);

}
