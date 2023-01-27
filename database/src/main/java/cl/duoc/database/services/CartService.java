package cl.duoc.database.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.database.models.entities.CartEntity;
import cl.duoc.database.models.repositories.CartRepository;

@Service
public class CartService {
    
    @Autowired
    CartRepository cartRepository;

    public List<CartEntity> getCartByUserId(String id) {
        return cartRepository.getCartByUserId(id);
    }

    public Integer getTotalPrice(String id) {
        return cartRepository.getTotalPrice(id);
    }

    public String removeInstrumentFromCart(String id) {
        try {
            int number = Integer.parseInt(id);

            cartRepository.deleteById(number);
            return "Producto eliminado.";
        } catch (Exception e) {
            return "Error al eliminar producto.";
        }
    }
}
