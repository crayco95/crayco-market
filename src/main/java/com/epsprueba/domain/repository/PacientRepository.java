package com.epsprueba.domain.repository;

import com.epsprueba.domain.Pacient;

import java.util.List;
import java.util.Optional;

public interface PacientRepository {
    List<Pacient> getAll();
    Optional<Pacient> getByPacientIdCard(int pacientIdCard);
    Optional<Pacient> getPacient(int pacientId);
    Pacient save(Pacient pacient);
    void delete(int pacientId);
}
