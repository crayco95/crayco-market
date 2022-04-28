package com.epsprueba.domain.service;


import com.epsprueba.domain.User;
import com.epsprueba.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }
    public List<User> getByUserId(int userId){
        return userRepository.getByUserId(userId);
    }
    public List<User> getByRoleId(int roleId){
        return userRepository.getByRoleId(roleId);
    }
    public Optional<User> getUser(int userId){
        return userRepository.getUser(userId);
    }
    public User save(User user){
        return userRepository.save(user);
    }
    public User update(User user, int userId) {
        return userRepository.getUser(userId)
                .map(user1 -> {
                    user.setUserId(user.getUserId());
                    user1.setRoleId(user.getRoleId());
                    user1.setUserName(user.getUserName());
                    user1.setPassword(user.getPassword());
                    user1.setRole(user.getRole());
                    return userRepository.save(user1);
                })
                .orElseGet(() -> {
                    user.setUserId(userId);
                    return userRepository.save(user);
                });
    }
    public boolean delete(int userId){
        return getUser(userId).map(user-> {
            userRepository.delete(userId);
            return true;
        }).orElse( false);
    }

}
