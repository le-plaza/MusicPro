package cl.duoc.database.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.duoc.database.models.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    
    @Query(value = "SELECT * FROM usuarios WHERE username = :user", nativeQuery = true)
    public UserEntity getUserByUsername(String user);

    @Query(value = "SELECT * FROM usuarios WHERE username = :user AND password = :pass", nativeQuery = true)
    public UserEntity loginCredentialsExists(String user, String pass);
}
