package com.epsprueba.domain.repository;

import com.epsprueba.domain.UserPacient;

import java.util.List;
import java.util.Optional;

public interface UserPacientRepository {
    List<UserPacient> getAll();
    Optional<UserPacient>getUserPacient(int userPacientId);
    UserPacient save(UserPacient userPacient);
    void delete(int userPacientId);
}
