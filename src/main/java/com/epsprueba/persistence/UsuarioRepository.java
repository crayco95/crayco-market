package com.epsprueba.persistence;

import com.epsprueba.domain.User;
import com.epsprueba.domain.repository.UserRepository;
import com.epsprueba.persistence.crud.UsuarioCrudRepository;
import com.epsprueba.persistence.entity.Usuario;
import com.epsprueba.persistence.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserRepository {
    private UsuarioCrudRepository usuarioCrudRepository;
    private UserMapper mapper;

    @Override
    public List<User> getAll(){
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUser(usuarios);
    }

    @Override
    public List<User> getByUserId(int userId) {
        List<Usuario> usuarios = usuarioCrudRepository.findByIdUsuarioOrderByNombreUsuarioAsc(userId);
        return mapper.toUser(usuarios);
    }

    @Override
    public List<User> getByRoleId(int roleId) {
        List<Usuario> usuarios = usuarioCrudRepository.findByIdRolOrderByNombreUsuarioAsc(roleId);
        return mapper.toUser(usuarios);
    }

    @Override
    public Optional<User> getUser(int userId) {
        return usuarioCrudRepository.findById(userId).map(usuario -> mapper.toUser(usuario));
    }

    @Override
    public User save(User user) {
        Usuario usuario = mapper.toUsuario(user);
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }

    @Override
    public void delete(int userId){
        usuarioCrudRepository.deleteById(userId);
    }

}
