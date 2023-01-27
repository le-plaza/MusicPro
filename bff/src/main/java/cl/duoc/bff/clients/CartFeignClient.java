package cl.duoc.bff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.bff.models.entities.CartEntity;

@FeignClient(name = "db-cart", url = "http://localhost:8181/api/cart")
public interface CartFeignClient {
    
    @GetMapping(path = "/search/{id}")
    public List<CartEntity> getCartByUsedId(@PathVariable String id);
    
    @GetMapping(path = "/search/{id}/total")
    public Integer getTotalPrice(@PathVariable String id);
    
    @DeleteMapping(path = "/remove/{id}")
    public String removeProductFromCart(@PathVariable String id);
}
