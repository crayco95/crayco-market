package com.epsprueba.domain;

import java.util.List;

public class Consultory {
    private int consultoryId;
    private int doctorId;
    private String departament;
    private String city;
    private String adress;
    private Doctor doctor;


    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getConsultoryId() {
        return consultoryId;
    }

    public void setConsultoryId(int consultoryId) {
        this.consultoryId = consultoryId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
