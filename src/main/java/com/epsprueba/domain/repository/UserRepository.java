package com.epsprueba.domain.repository;

import com.epsprueba.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAll();
    List<User> getByUserId(int userId);
    List<User> getByRoleId(int roleId);
    Optional<User>getUser(int userId);
    User save(User user);
    void delete(int userId);
}
