package com.epsprueba.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "consultorios")
public class Consultorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultorio")
    private Integer idConsultorio;

    @Column(name = "id_medico")
    private Integer idMedico;

    private String departamento;

    private String ciudad;

    private String direccion;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name ="id_medico", insertable = false, updatable = false)
    private Medico medico;

    @OneToMany(mappedBy = "consultorio")
    private List<Cita> citas;

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
}
