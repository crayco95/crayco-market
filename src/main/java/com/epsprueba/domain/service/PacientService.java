package com.epsprueba.domain.service;

import com.epsprueba.domain.Pacient;
import com.epsprueba.domain.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientService {
    @Autowired
    private PacientRepository pacientRepository;

    public List<Pacient> getAll(){
        return pacientRepository.getAll();
    }
    public Optional<Pacient>getByPacientIdCard(int pacientIdCard){
        return pacientRepository.getByPacientIdCard(pacientIdCard);
    }
    public Optional<Pacient> getPacient(int pacientId){
        return pacientRepository.getPacient(pacientId);
    }
    public Pacient save(Pacient pacient){
        return pacientRepository.save(pacient);
    }
    public boolean delete(int pacientId){
        return getPacient(pacientId).map(pacient -> {
            pacientRepository.delete(pacientId);
            return true;
        }).orElse( false);
    }
}
