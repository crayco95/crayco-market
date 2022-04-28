package com.epsprueba.web.controller;

import com.epsprueba.domain.Pacient;
import com.epsprueba.domain.service.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacients")
public class PacientController {
    @Autowired
    private PacientService pacientService;
    @GetMapping("/all")
    public List<Pacient> getAll(){
        return pacientService.getAll();
    }
    @GetMapping("/idCard/{id}")
    public Optional<Pacient> getByPacientIdCard(@PathVariable("id") int pacientIdCard){
        return pacientService.getByPacientIdCard(pacientIdCard);
    }
    @GetMapping("/{id}")
    public Optional<Pacient> getPacient(int pacientId){
        return pacientService.getPacient(pacientId);
    }
    @PostMapping("/save")
    public Pacient save(@RequestBody Pacient pacient){
        return pacientService.save(pacient);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody Pacient pacient, @PathVariable("id") int pacientId){
        pacientService.update(pacient, pacientId);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(int pacientId){
        return pacientService.delete(pacientId);
    }
}
