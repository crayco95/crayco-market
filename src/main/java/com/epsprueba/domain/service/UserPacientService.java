package com.epsprueba.domain.service;


import com.epsprueba.domain.UserPacient;
import com.epsprueba.domain.repository.UserPacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserPacientService {
    @Autowired
    private UserPacientRepository userPacientRepository;

    public List<UserPacient> getAll(){
        return userPacientRepository.getAll();
    }
    public Optional<UserPacient> getUserPacient(int userPacientId){
        return userPacientRepository.getUserPacient(userPacientId);
    }
    public UserPacient save(UserPacient userPacient){
        return userPacientRepository.save(userPacient);
    }
    public boolean delete(int userPacientId){
        return getUserPacient(userPacientId).map(userPacient -> {
            userPacientRepository.delete(userPacientId);
            return true;
        }).orElse( false);
    }
}
