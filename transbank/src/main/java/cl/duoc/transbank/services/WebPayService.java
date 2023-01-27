package cl.duoc.transbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cl.duoc.transbank.clients.WebPayFeignClient;
import cl.duoc.transbank.models.entities.TransactionRequestEntity;
import cl.duoc.transbank.models.entities.TransactionResponseEntity;

@Service
public class WebPayService {

    @Autowired
    WebPayFeignClient webPayFeignClient;

    @Value("${webpay.headers.api-key-id}")
    private String webpayApiKey;

    @Value("${webpay-headers.api-key-secret}")
    private String webpaySecretKey;

    public TransactionResponseEntity initTransaction(TransactionRequestEntity request) {
        return webPayFeignClient.initTransaction(webpayApiKey, webpaySecretKey, request);
    }
}
