package com.epsprueba.web.controller;

import com.epsprueba.domain.Consultory;
import com.epsprueba.domain.service.ConsultoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultory")
public class ConsultoryController {
    @Autowired
    private ConsultoryService consultoryService;
    @GetMapping("/all")
    public List<Consultory> getAll(){
        return consultoryService.getAll();
    }
    @GetMapping("/doctorId/{id}")
    public List<Consultory> getByDoctorId(@PathVariable("id") int doctorId){
        return consultoryService.getByDoctorId(doctorId);
    }
    @GetMapping("/departament-city/{dep}-{city}")
    public List<Consultory> getByDepartamentAndCity(@PathVariable("dep") String departament, @PathVariable("city") String city){
        return consultoryService.getByDepartamentAndCity(departament, city);
    }
    @GetMapping("/{id}")
    public Optional<Consultory> getConsultory(@PathVariable("id") int consultoryId){
        return consultoryService.getConsultory(consultoryId);
    }
    @PostMapping("/save")
    public Consultory save(Consultory consultory){
        return consultoryService.save(consultory);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(int consultoryId){
        return consultoryService.delete(consultoryId);
    }
}
