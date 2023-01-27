package cl.duoc.bff.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.bff.clients.CartFeignClient;
import cl.duoc.bff.models.entities.CartEntity;

@Service
public class CartService {
    
    @Autowired
    CartFeignClient cartFeignClient;
    
    public List<CartEntity> getCartByUsedId(String id) {
        return cartFeignClient.getCartByUsedId(id);
    }

    public Integer getTotalPrice(String id) {
        return cartFeignClient.getTotalPrice(id);
    }
    
    public String removeProductFromCart(String id) {
        return cartFeignClient.removeProductFromCart(id);
    }
}
