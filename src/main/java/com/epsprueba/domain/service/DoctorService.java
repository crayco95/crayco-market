package com.epsprueba.domain.service;

import com.epsprueba.domain.Doctor;
import com.epsprueba.domain.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAll(){
        return doctorRepository.getAll();
    }
    public List<Doctor> getByDoctorId(int doctorId){
        return doctorRepository.getByDoctorId(doctorId);
    }
    public Optional<Doctor> getDoctor(int doctorId){
        return doctorRepository.getDoctor(doctorId);
    }
    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public boolean delete(int doctorId){
        return getDoctor(doctorId).map(doctor -> {
            doctorRepository.delete(doctorId);
            return true;
        }).orElse( false);
    }
}
