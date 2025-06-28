package ru.netology.users;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    Optional<User> getUserById(int id) {
        return repository.findUserById(id);
    }
}
