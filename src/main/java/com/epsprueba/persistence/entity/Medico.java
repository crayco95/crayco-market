package com.epsprueba.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Integer idMedico;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre_medico")
    private String nombreMedico;

    @Column(name = "apellido_medico")
    private String apellidoMedico;

    @Column(name = "correo_electronico")
    private String correo;

    @Column(name = "estado_medico")
    private boolean estadoMedico;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstadoMedico() {
        return estadoMedico;
    }

    public void setEstadoMedico(boolean estadoMedico) {
        this.estadoMedico = estadoMedico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
