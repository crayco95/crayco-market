package com.epsprueba.persistence;

import com.epsprueba.persistence.crud.MedicoCrudRepository;
import com.epsprueba.persistence.entity.Medico;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicoRepository {
    private MedicoCrudRepository medicoCrudRepository;

    public List<Medico> getAll(){
        return (List<Medico>) medicoCrudRepository.findAll();
    }
    public List<Medico> getByIdMedico(int idMedico){
        return medicoCrudRepository.findByIdMedicoOrderByIdMedicoAsc(idMedico);
    }
    //public List<Medico> getByIdUsuario(int idUsuario){
    //    return medicoCrudRepository.findByIdUsuarioOrderByIdMedicoAsc(idUsuario);
    //}
    public Optional<Medico> getMedico(int idMedico){
        return medicoCrudRepository.findById(idMedico);
    }
    public Medico save(Medico medico){
        return medicoCrudRepository.save(medico);
    }
    public void delete(int idMedico){
        medicoCrudRepository.deleteById(idMedico);
    }
}
