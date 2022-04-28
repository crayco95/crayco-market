package com.epsprueba.web.controller;

import com.epsprueba.domain.Appointment;
import com.epsprueba.domain.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @GetMapping("/all")
    public List<Appointment> getAll(){
        return appointmentService.getAll();
    }
    @GetMapping("/pacientId/{id}")
    public List<Appointment> getByPacientId(@PathVariable("id") int pacientId){
        return appointmentService.getByPacientId(pacientId);
    }
    @GetMapping("/consultoryId/{id}")
    public List<Appointment> getByConsultoryId(@PathVariable("id") int consultoryId){
        return appointmentService.getByConsultoryId(consultoryId);
    }
    @GetMapping("/date/{date}")
    public List<Appointment> getByDate(@PathVariable("date") Date date){
        return appointmentService.getByDate(date);
    }
    @GetMapping("/{id}")
    public Optional<Appointment> getAppointment(@PathVariable("id") int appointmentId){
        return appointmentService.getAppointment(appointmentId);
    }
    @PostMapping("/save")
    public Appointment save(@RequestBody Appointment appointment){
        return appointmentService.save(appointment);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody Appointment appointment, @PathVariable("id") int appointmentId){
        appointmentService.update(appointment, appointmentId);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(int appointmentId){
        return appointmentService.delete(appointmentId);
    }
}
