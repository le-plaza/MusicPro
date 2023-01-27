package cl.duoc.bff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import cl.duoc.bff.models.entities.LoginCredentials;
import cl.duoc.bff.models.entities.UserEntity;

@FeignClient(name = "db-usuarios", url = "http://localhost:8181/api/users")
public interface UserFeignClient {
    
    @GetMapping(path = "/search/{id}")
    public UserEntity getUserById(@PathVariable String id);

    @GetMapping(path = "/all")
    public List<UserEntity> findAll();

    @PostMapping(path = "/register")
    public UserEntity register(@RequestBody UserEntity userEntity);

    @PostMapping(path = "/login")
    public UserEntity login(@RequestBody LoginCredentials login);

    @PutMapping(path = "/edit/{id}")
    public UserEntity changePassword(@PathVariable String id, @RequestParam String password);
}
