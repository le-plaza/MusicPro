package cl.duoc.bff.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.bff.clients.UserFeignClient;
import cl.duoc.bff.models.entities.LoginCredentials;
import cl.duoc.bff.models.entities.UserEntity;

@Service
public class UserService {
    
    @Autowired
    UserFeignClient userFeignClient;

    public UserEntity getUserById(String id) {
        return userFeignClient.getUserById(id);
    }

    public List<UserEntity> getAll() {
        return userFeignClient.findAll();
    }

    public UserEntity register(UserEntity userEntity) {
        return userFeignClient.register(userEntity);
    }

    public UserEntity login(LoginCredentials loginCredentials) {
        return userFeignClient.login(loginCredentials);
    }

    public UserEntity changePassword(String id, String password) {
        return userFeignClient.changePassword(id, password);
    }
}
