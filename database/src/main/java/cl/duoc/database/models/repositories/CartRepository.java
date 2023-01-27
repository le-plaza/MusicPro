package cl.duoc.database.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.duoc.database.models.entities.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    
    @Query(value = "SELECT * FROM carrito WHERE id_usuario = :user", nativeQuery = true)
    public List<CartEntity> getCartByUserId(String user);

    @Query(value = "SELECT IFNULL(SUM(precio_instrumento), 0) FROM carrito WHERE id_usuario = :user", nativeQuery = true)
    public Integer getTotalPrice(String user);
}
