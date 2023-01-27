package cl.duoc.transbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.transbank.models.entities.TransactionRequestEntity;
import cl.duoc.transbank.models.entities.TransactionResponseEntity;
import cl.duoc.transbank.services.WebPayService;

@RestController
@RequestMapping(path = "/webpay-amb")
public class WebpayController {

    @Autowired
    WebPayService webPayService;

    @PostMapping(path = "/transactions", produces = { "application/json" })
    public TransactionResponseEntity initTransaction(@RequestBody TransactionRequestEntity request) {
        return webPayService.initTransaction(request);
    }
}
