package com.epsprueba.persistence;

import com.epsprueba.domain.Consultory;
import com.epsprueba.domain.repository.ConsultoryRepository;
import com.epsprueba.persistence.crud.ConsultorioCrudRepository;
import com.epsprueba.persistence.entity.Consultorio;
import com.epsprueba.persistence.mapper.ConsultoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
@Repository
public class ConsultorioRepository implements ConsultoryRepository {
    @Autowired
    private ConsultorioCrudRepository consultorioCrudRepository;
    @Autowired
    private ConsultoryMapper mapper;

    public List<Consultory> getAll(){
        List<Consultorio> consultorios = (List<Consultorio>) consultorioCrudRepository.findAll();
        return mapper.toConsultory(consultorios);
    }

    @Override
    public List<Consultory> getByConsultoryId(int consultoryId) {
        List<Consultorio> consultorios = consultorioCrudRepository.findByIdConsultorioOrderByIdConsultorioAsc(consultoryId);
        return mapper.toConsultory(consultorios);
    }

    @Override
    public List<Consultory> getByDoctorId(int doctorId) {
        List<Consultorio> consultorios = consultorioCrudRepository.findByIdMedicoOrderByIdConsultorioAsc(doctorId);
        return mapper.toConsultory(consultorios);
    }

    @Override
    public List<Consultory> getByDepartamentAndCity(String departament, String city) {
        List<Consultorio> consultorios = consultorioCrudRepository.findByDepartamentoAndCiudad(departament, city);
        return mapper.toConsultory(consultorios);
    }

    @Override
    public Optional<Consultory> getConsultory(int consultoryId) {
        return consultorioCrudRepository.findById(consultoryId).map(consultorio -> mapper.toConsultory(consultorio));
    }

    @Override
    public Consultory save(Consultory consultory) {
        Consultorio consultorio = mapper.toConsultorio(consultory);
        return mapper.toConsultory(consultorioCrudRepository.save(consultorio));
    }

    @Override
    public void delete(int consultoryId){
        consultorioCrudRepository.deleteById(consultoryId);
    }
}
