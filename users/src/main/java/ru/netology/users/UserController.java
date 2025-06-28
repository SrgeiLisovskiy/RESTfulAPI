package ru.netology.users;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service){
        this.service = service;
    }
    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable int userId){
        Optional<User> user;
        user = service.getUserById(userId);
        return user;
    }
}
