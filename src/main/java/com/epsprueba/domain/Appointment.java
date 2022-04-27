package com.epsprueba.domain;



import java.sql.Time;
import java.util.Date;

public class Appointment {
    private int appointmentId;
    private int consultoryId;
    private int pacientId;
    private Date date;
    private Time hour;
    private boolean active;
    private String medicines;
    private String diagnosis;
    private String cancellationReason;
    private Consultory consultory;
    private Pacient pacient;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getConsultoryId() {
        return consultoryId;
    }

    public void setConsultoryId(int consultoryId) {
        this.consultoryId = consultoryId;
    }

    public int getPacientId() {
        return pacientId;
    }

    public void setPacientId(int pacientId) {
        this.pacientId = pacientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Consultory getConsultory() {
        return consultory;
    }

    public void setConsultory(Consultory consultory) {
        this.consultory = consultory;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }
}
