package com.epsprueba.domain.repository;

import com.epsprueba.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository {
    List<Doctor> getAll();
    List<Doctor> getByDoctorId(int doctorId);
    Optional<Doctor> getDoctor(int doctorId);
    Doctor save(Doctor doctor);
    void delete(int doctorId);
}
