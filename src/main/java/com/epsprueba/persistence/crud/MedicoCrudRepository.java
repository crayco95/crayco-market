package com.epsprueba.persistence.crud;

import com.epsprueba.persistence.entity.Medico;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicoCrudRepository extends CrudRepository<Medico, Integer> {

    List<Medico> findByIdMedicoOrderByIdMedicoAsc(int idMedico);

    //List<Medico> findByIdUsuarioOrderByIdMedicoAsc(int idUsuario);

}
