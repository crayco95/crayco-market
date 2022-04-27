package com.epsprueba.domain.repository;

import com.epsprueba.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository {
    List<DoctorRepository> getAll();
    List<DoctorRepository> getByDoctorId(int doctorId);
    Optional<DoctorRepository> getDoctor(int doctorId);
    Doctor save(Doctor doctor);
    void delete(int doctorId);
}
