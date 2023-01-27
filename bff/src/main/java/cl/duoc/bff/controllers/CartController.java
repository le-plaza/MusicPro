package cl.duoc.bff.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.bff.models.entities.CartEntity;
import cl.duoc.bff.services.CartService;

@RestController
@RequestMapping(path = "/cart-bff")
public class CartController {
    
    @Autowired
    CartService cartService;

    @GetMapping(path = "/search/{id}")
    public List<CartEntity> getCartByUsedId(@PathVariable String id) {
        return cartService.getCartByUsedId(id);
    }

    @GetMapping(path = "/search/{id}/total")
    public Integer getTotalPrice(@PathVariable String id) {
        return cartService.getTotalPrice(id);
    }

    @DeleteMapping(path = "/remove/{id}")
    public String removeProductFromCart(@PathVariable String id) {
        return cartService.removeProductFromCart(id);
    }
}
