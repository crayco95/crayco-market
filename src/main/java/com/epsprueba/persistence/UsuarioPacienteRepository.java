package com.epsprueba.persistence;


import com.epsprueba.domain.User;
import com.epsprueba.domain.repository.UserRepository;
import com.epsprueba.persistence.crud.UsuarioPacienteCrudRepository;
import com.epsprueba.persistence.entity.UsuarioPaciente;
import com.epsprueba.persistence.mapper.UserPacientMapper;

import java.util.List;
import java.util.Optional;

public class UsuarioPacienteRepository implements UserRepository {
    private UsuarioPacienteCrudRepository usuarioPacienteCrudRepository;
    private UserPacientMapper mapper;

    public List<UsuarioPaciente> getAll(){
        return (List<UsuarioPaciente>) usuarioPacienteCrudRepository.findAll();
    }

    @Override
    public List<User> getByUserId(int userId) {
        return null;
    }

    @Override
    public List<User> getByRoleId(int roleId) {
        return null;
    }

    @Override
    public Optional<User> getUser(int userId) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    public Optional<UsuarioPaciente> getUsuarioPaciente(int idUsuarioPaciente){
        return usuarioPacienteCrudRepository.findById(idUsuarioPaciente);
    }
    public UsuarioPaciente save(UsuarioPaciente usuarioPaciente){
        return usuarioPacienteCrudRepository.save(usuarioPaciente);
    }
    public void delete(int idUsuarioPaciente){
        usuarioPacienteCrudRepository.deleteById(idUsuarioPaciente);
    }
}
