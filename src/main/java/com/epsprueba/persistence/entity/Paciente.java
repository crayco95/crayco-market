package com.epsprueba.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer idPaciente;
    @Column(name = "id_usuario_paciente")
    private Integer idUsuarioPaciente;
    @Column(name = "cedula_paciente")
    private String cedulaPaciente;
    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    @Column(name = "apellido_paciente")
    private String apellidoPaciente;

    @Column(name = "celular_paciente")
    private String celularPaciente;

    @Column(name = "direccion_paciente")
    private String direccionPaciente;

    @Column(name = "correo_electronico")
    private String correo;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_usuario_paciente", insertable = false, updatable = false)
    private UsuarioPaciente usuarioPaciente;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String getCelularPaciente() {
        return celularPaciente;
    }

    public void setCelularPaciente(String celularPaciente) {
        this.celularPaciente = celularPaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public Integer getIdUsuarioPaciente() {
        return idUsuarioPaciente;
    }

    public void setIdUsuarioPaciente(Integer idUsuarioPaciente) {
        this.idUsuarioPaciente = idUsuarioPaciente;
    }

    public UsuarioPaciente getUsuarioPaciente() {
        return usuarioPaciente;
    }

    public void setUsuarioPaciente(UsuarioPaciente usuarioPaciente) {
        this.usuarioPaciente = usuarioPaciente;
    }
}
