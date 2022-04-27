package com.epsprueba.persistence;

import com.epsprueba.persistence.crud.PacienteCrudRepository;
import com.epsprueba.persistence.entity.Paciente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepository {
    private PacienteCrudRepository pacienteCrudRepository;

    public List<Paciente> getAll(){
        return (List<Paciente>) pacienteCrudRepository.findAll();
    }
    public Optional<Paciente>getByCedula(int cedulaPaciente){
        return pacienteCrudRepository.findByCedulaPaciente(cedulaPaciente);
    }

    public Optional<Paciente> getPaciente(int idPaciente){
        return pacienteCrudRepository.findById(idPaciente);
    }

    public Paciente save(Paciente paciente){
        return pacienteCrudRepository.save(paciente);
    }

    public void delete(int idPaciente){
        pacienteCrudRepository.deleteById(idPaciente);
    }
}
