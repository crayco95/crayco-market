package com.epsprueba.persistence.crud;

import com.epsprueba.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findByIdRolOrderByNombreUsuarioAsc(int idRol);

    List<Usuario> findByIdUsuarioOrderByNombreUsuarioAsc(int idUsuario);


}
