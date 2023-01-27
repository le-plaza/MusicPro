package cl.duoc.database.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.database.models.entities.LoginCredentials;
import cl.duoc.database.models.entities.UserEntity;
import cl.duoc.database.services.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping(path = "/search/{id}")
    public UserEntity getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping(path = "/all")
    public List<UserEntity> getAll() {
        return userService.getAll();
    }

    @PostMapping(path = "/register")
    public UserEntity register(@RequestBody UserEntity userEntity) {
        return userService.register(userEntity);
    }

    @PostMapping(path = "/login")
    public UserEntity login(@RequestBody LoginCredentials loginCredentials) {
        return userService.login(loginCredentials);
    }

    @PutMapping(path = "/edit/{id}")
    public UserEntity changePassword(@PathVariable String id, @RequestParam String password) {
        return userService.changePassword(id, password);
    }
}
