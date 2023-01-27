package cl.duoc.bff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.bff.clients.WebpayFeignClient;
import cl.duoc.bff.models.entities.WebpayEntities.TransactionRequestEntity;
import cl.duoc.bff.models.entities.WebpayEntities.TransactionResponseEntity;

@Service
public class WebpayService {
    
    @Autowired
    WebpayFeignClient webpayFeignClient;

    public TransactionResponseEntity initTransaction(TransactionRequestEntity request) {
        return webpayFeignClient.initTransaction(request);
    }
}
