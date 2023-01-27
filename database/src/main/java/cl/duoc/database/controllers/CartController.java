package cl.duoc.database.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.database.models.entities.CartEntity;
import cl.duoc.database.services.CartService;

@RestController
@RequestMapping(path = "/api/cart")
public class CartController {
    
    @Autowired
    CartService cartService;

    @GetMapping(path = "/search/{id}")
    public List<CartEntity> getCartByUserId(@PathVariable String id) {
        return cartService.getCartByUserId(id);
    }

    @GetMapping(path = "/search/{id}/total")
    public Integer getTotalPrice(@PathVariable String id) {
        return cartService.getTotalPrice(id);
    }

    @DeleteMapping(path = "/remove/{id}")
    public String removeProductFromCart(@PathVariable String id) {
        return cartService.removeInstrumentFromCart(id);
    } 
}
