package com.epsprueba.persistence;



import com.epsprueba.domain.UserPacient;
import com.epsprueba.domain.repository.UserPacientRepository;
import com.epsprueba.persistence.crud.UsuarioPacienteCrudRepository;
import com.epsprueba.persistence.entity.UsuarioPaciente;
import com.epsprueba.persistence.mapper.UserPacientMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UsuarioPacienteRepository implements UserPacientRepository {
    private UsuarioPacienteCrudRepository usuarioPacienteCrudRepository;
    private UserPacientMapper mapper;

    public List<UserPacient> getAll(){
        List<UsuarioPaciente> usuarioPacientes = (List<UsuarioPaciente>) usuarioPacienteCrudRepository.findAll();
        return mapper.toUserPacient(usuarioPacientes);
    }

    @Override
    public Optional<UserPacient> getUserPacient(int userPacientId) {
        return usuarioPacienteCrudRepository.findById(userPacientId).map(usuarioPaciente -> mapper.toUserPacient(usuarioPaciente));
    }

    @Override
    public UserPacient save(UserPacient userPacient) {
        UsuarioPaciente usuarioPaciente = mapper.toUsuarioPaciente(userPacient);
        return mapper.toUserPacient(usuarioPacienteCrudRepository.save(usuarioPaciente));
    }
    @Override
    public void delete(int userPacientId){
        usuarioPacienteCrudRepository.deleteById(userPacientId);
    }
}
