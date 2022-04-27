package com.epsprueba.domain;

import java.util.List;

public class Pacient {
    private int pacientId;
    private int userPacientId;
    private String pacientIdCard;
    private String namePacient;
    private String lastNamePacient;
    private String adressPacient;
    private String email;
    private String cellPhonePacient;
    private UserPacient userPacient;

    public int getPacientId() {
        return pacientId;
    }

    public void setPacientId(int pacientId) {
        this.pacientId = pacientId;
    }

    public int getUserPacientId() {
        return userPacientId;
    }

    public void setUserPacientId(int userPacientId) {
        this.userPacientId = userPacientId;
    }

    public String getPacientIdCard() {
        return pacientIdCard;
    }

    public void setPacientIdCard(String pacientIdCard) {
        this.pacientIdCard = pacientIdCard;
    }

    public String getNamePacient() {
        return namePacient;
    }

    public void setNamePacient(String namePacient) {
        this.namePacient = namePacient;
    }

    public String getLastNamePacient() {
        return lastNamePacient;
    }

    public void setLastNamePacient(String lastNamePacient) {
        this.lastNamePacient = lastNamePacient;
    }

    public String getAdressPacient() {
        return adressPacient;
    }

    public void setAdressPacient(String adressPacient) {
        this.adressPacient = adressPacient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhonePacient() {
        return cellPhonePacient;
    }

    public void setCellPhonePacient(String cellPhonePacient) {
        this.cellPhonePacient = cellPhonePacient;
    }

    public UserPacient getUserPacient() {
        return userPacient;
    }

    public void setUserPacient(UserPacient userPacient) {
        this.userPacient = userPacient;
    }
}
