package com.epsprueba.web.controller;

import com.epsprueba.domain.Doctor;
import com.epsprueba.domain.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/all")
    public List<Doctor> getAll(){
        return doctorService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Doctor> getDoctor(@PathVariable("id") int doctorId){
        return doctorService.getDoctor(doctorId);
    }
    @PostMapping("/save")
    public Doctor save(@RequestBody Doctor doctor){
        return doctorService.save(doctor);
    }
    @DeleteMapping("/delete")
    public boolean delete(int doctorId){
        return doctorService.delete(doctorId);
    }
}
