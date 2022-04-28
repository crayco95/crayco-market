package com.epsprueba.domain.service;

import com.epsprueba.domain.Doctor;
import com.epsprueba.domain.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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
    public Doctor update(Doctor doctor, int doctorId) {
        return doctorRepository.getDoctor(doctorId)
                .map(doctor1 -> {
                    doctor1.setDoctorId(doctor.getDoctorId());
                    doctor1.setUserId(doctor.getUserId());
                    doctor1.setNameDoctor(doctor.getNameDoctor());
                    doctor1.setLastNameDoctor(doctor.getLastNameDoctor());
                    doctor1.setEmail(doctor.getEmail());
                    doctor1.setActive(doctor.isActive());
                    doctor1.setUser(doctor.getUser());
                    return doctorRepository.save(doctor1);
                })
                .orElseGet(() -> {
                    doctor.setDoctorId(doctorId);
                    return doctorRepository.save(doctor);
                });
    }
    public boolean delete(int doctorId){
        return getDoctor(doctorId).map(doctor -> {
            doctorRepository.delete(doctorId);
            return true;
        }).orElse( false);
    }
}
