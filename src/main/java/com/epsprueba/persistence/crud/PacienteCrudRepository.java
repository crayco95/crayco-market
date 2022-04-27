package com.epsprueba.persistence.crud;

import com.epsprueba.persistence.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PacienteCrudRepository extends CrudRepository<Paciente, Integer> {
    Optional<Paciente> findByCedulaPaciente(int cedulaPaciente);
}
