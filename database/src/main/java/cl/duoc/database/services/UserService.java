package cl.duoc.database.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.database.models.entities.LoginCredentials;
import cl.duoc.database.models.entities.UserEntity;
import cl.duoc.database.models.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public boolean userExists(String username) {
        return userRepository.getUserByUsername(username) != null;
    }

    public UserEntity getUserById(String id) {
        try {
            int number = Integer.parseInt(id);
            return userRepository.findById(number).get();
        } catch (Exception e) {
            return null;
        }
    }

    public List<UserEntity> getAll() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public UserEntity register(UserEntity userEntity) {
        try {
            if (userExists(userEntity.getUsername())) {
                return null;
            }

            return userRepository.save(userEntity);
        } catch (Exception e) {
            return null;
        }
    }

    public UserEntity login(LoginCredentials loginCredentials) {
        try {
            if (!userExists(loginCredentials.getUsername())) {
                return null;
            }
    
            return userRepository.loginCredentialsExists(loginCredentials.getUsername(), loginCredentials.getPassword());
        } catch (Exception e) {
            return null;
        }
    }

    public UserEntity changePassword(String id, String password) {
        try {
            int number = Integer.parseInt(id);
            UserEntity user = userRepository.findById(number).get();

            user.setPassword(password);
            return userRepository.save(user);
        } catch (Exception e) {
            return null;
        }
    }
}
