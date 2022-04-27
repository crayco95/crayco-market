package com.epsprueba.persistence;

import com.epsprueba.domain.Doctor;
import com.epsprueba.domain.repository.DoctorRepository;
import com.epsprueba.persistence.crud.MedicoCrudRepository;
import com.epsprueba.persistence.entity.Medico;
import com.epsprueba.persistence.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicoRepository implements DoctorRepository {
    @Autowired
    private MedicoCrudRepository medicoCrudRepository;
    @Autowired
    private DoctorMapper mapper;

    public List<Doctor> getAll(){
        List<Medico> medicos = (List<Medico>) medicoCrudRepository.findAll();
        return mapper.toDoctor(medicos);
    }

    @Override
    public List<Doctor> getByDoctorId(int doctorId) {
        List<Medico> medicos = medicoCrudRepository.findByIdMedicoOrderByIdMedicoAsc(doctorId);
        return mapper.toDoctor(medicos);
    }

    @Override
    public Optional<Doctor> getDoctor(int doctorId) {
        return medicoCrudRepository.findById(doctorId).map(medico -> mapper.toDoctor(medico));
    }

    @Override
    public Doctor save(Doctor doctor) {
        Medico medico = mapper.toMedico(doctor);
        return mapper.toDoctor(medicoCrudRepository.save(medico));
    }
    @Override
    public void delete(int doctorId){
        medicoCrudRepository.deleteById(doctorId);
    }
}
