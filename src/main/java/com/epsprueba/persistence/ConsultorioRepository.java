package com.epsprueba.persistence;

import com.epsprueba.persistence.crud.ConsultorioCrudRepository;
import com.epsprueba.persistence.entity.Consultorio;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ConsultorioRepository {
    private ConsultorioCrudRepository consultorioCrudRepository;

    public List<Consultorio> getAll(){
        return (List<Consultorio>) consultorioCrudRepository.findAll();
    }
    public List<Consultorio> getByIdConsultorio(int idConsultorio){
        return consultorioCrudRepository.findByIdConsultorioOrderByIdConsultorioAsc(idConsultorio);
    }
    public List<Consultorio> getByIdMedico(int idMedico){
        return consultorioCrudRepository.findByIdMedicoOrderByIdConsultorioAsc(idMedico);
    }
    public List<Consultorio> getByDepartamentoAndCiudad(String departamento, String ciudad){
        return consultorioCrudRepository.findByDepartamentoAndCiudad(departamento, ciudad);
    }
    public Optional<Consultorio> getConsultorio(int idConsultorio){
        return consultorioCrudRepository.findById(idConsultorio);
    }
    public Consultorio save(Consultorio consultorio){
        return consultorioCrudRepository.save(consultorio);
    }
    public void delete(int idConsultorio){
        consultorioCrudRepository.deleteById(idConsultorio);
    }
}
