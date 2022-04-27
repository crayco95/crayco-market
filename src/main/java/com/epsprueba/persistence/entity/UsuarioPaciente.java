package com.epsprueba.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuario_pacientes")
public class UsuarioPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_paciente")
    private Integer idUsuarioPaciente;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name ="password")
    private String password;


    public Integer getIdUsuarioPaciente() {
        return idUsuarioPaciente;
    }

    public void setIdUsuarioPaciente(Integer idUsuarioPaciente) {
        this.idUsuarioPaciente = idUsuarioPaciente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
