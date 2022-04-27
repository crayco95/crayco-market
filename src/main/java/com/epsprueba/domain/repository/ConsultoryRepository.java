package com.epsprueba.domain.repository;

import com.epsprueba.domain.Consultory;


import java.util.List;
import java.util.Optional;

public interface ConsultoryRepository {
    List<Consultory> getAll();
    List<Consultory>getByConsultoryId(int consultoryId);
    List<Consultory>getByDoctorId(int doctorId);
    List<Consultory> getByDepartamentAndCity(String departament, String city );
    Optional<Consultory> getConsultory(int consultoryId);
    Consultory save(Consultory consultory);
    void delete(int consultoryId);
}
