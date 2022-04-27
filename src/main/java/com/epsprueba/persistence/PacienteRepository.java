package com.epsprueba.persistence;

import com.epsprueba.domain.Pacient;
import com.epsprueba.domain.repository.PacientRepository;
import com.epsprueba.persistence.crud.PacienteCrudRepository;
import com.epsprueba.persistence.entity.Paciente;
import com.epsprueba.persistence.mapper.PacientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepository implements PacientRepository {
    @Autowired
    private PacienteCrudRepository pacienteCrudRepository;
    @Autowired
    private PacientMapper mapper;

    public List<Pacient> getAll(){
        List<Paciente> pacientes = (List<Paciente>) pacienteCrudRepository.findAll();
        return mapper.toPacient(pacientes);
    }

    @Override
    public Optional<Pacient> getByPacientIdCard(int pacientIdCard) {
        return pacienteCrudRepository.findByCedulaPaciente(pacientIdCard).map(pacienteCard -> mapper.toPacient(pacienteCard));
    }

    @Override
    public Optional<Pacient> getPacient(int pacientId) {
        return pacienteCrudRepository.findById(pacientId).map(paciente -> mapper.toPacient(paciente));
    }

    @Override
    public Pacient save(Pacient pacient) {
        Paciente paciente = mapper.toPaciente(pacient);
        return mapper.toPacient(pacienteCrudRepository.save(paciente));
    }
    @Override
    public void delete(int pacientId){
        pacienteCrudRepository.deleteById(pacientId);
    }
}
