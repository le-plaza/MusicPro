package cl.duoc.bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.bff.models.entities.WebpayEntities.TransactionRequestEntity;
import cl.duoc.bff.models.entities.WebpayEntities.TransactionResponseEntity;

@FeignClient(name = "webpay-amb", url = "http://localhost:8282/webpay-amb")
public interface WebpayFeignClient {

    @PostMapping(path = "/transactions")
    public TransactionResponseEntity initTransaction(@RequestBody TransactionRequestEntity request);
}
