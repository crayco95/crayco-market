package com.epsprueba.domain.service;

import com.epsprueba.domain.Consultory;
import com.epsprueba.domain.repository.ConsultoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultoryService {
    @Autowired
    private ConsultoryRepository consultoryRepository;

    public List<Consultory> getAll(){
        return consultoryRepository.getAll();
    }
    public List<Consultory> getByConsultoryId(int consultoryId){
        return consultoryRepository.getByConsultoryId(consultoryId);
    }
    public List<Consultory> getByDoctorId(int doctorId){
        return consultoryRepository.getByDoctorId(doctorId);
    }
    public List<Consultory> getByDepartamentAndCity(String departament, String city){
        return consultoryRepository.getByDepartamentAndCity(departament, city);
    }
    public Optional<Consultory> getConsultory(int consultoryId){
        return consultoryRepository.getConsultory(consultoryId);
    }
    public Consultory save(Consultory consultory){
        return consultoryRepository.save(consultory);
    }
    public Consultory update(Consultory consultory, int consultoryId) {
        return consultoryRepository.getConsultory(consultoryId)
                .map(consultory1 -> {
                    consultory1.setConsultoryId(consultory.getConsultoryId());
                    consultory1.setDoctorId(consultory.getDoctorId());
                    consultory1.setDepartament(consultory.getDepartament());
                    consultory1.setCity(consultory.getCity());
                    consultory1.setAdress(consultory.getAdress());
                    consultory1.setDoctor(consultory.getDoctor());
                    return consultoryRepository.save(consultory1);
                })
                .orElseGet(() -> {
                    consultory.setConsultoryId(consultoryId);
                    return consultoryRepository.save(consultory);
                });
    }
    public boolean delete(int consultoryId){
        return getConsultory(consultoryId).map(consultory -> {
            consultoryRepository.delete(consultoryId);
            return true;
        }).orElse( false);
    }
}
