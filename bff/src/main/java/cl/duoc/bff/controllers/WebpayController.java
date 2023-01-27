package cl.duoc.bff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.bff.models.entities.WebpayEntities.TransactionRequestEntity;
import cl.duoc.bff.models.entities.WebpayEntities.TransactionResponseEntity;
import cl.duoc.bff.services.WebpayService;

@RestController
@RequestMapping(path = "/webpay-bff")
public class WebpayController {
    
    @Autowired
    WebpayService webpayService;

    @PostMapping(path = "/transactions")
    public TransactionResponseEntity initTransaction(@RequestBody TransactionRequestEntity request) {
        return webpayService.initTransaction(request);
    }
}
