package cl.duoc.transbank.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cl.duoc.transbank.models.entities.TransactionRequestEntity;
import cl.duoc.transbank.models.entities.TransactionResponseEntity;

@FeignClient(name = "webpay", url = "https://webpay3gint.transbank.cl")
public interface WebPayFeignClient {

    @PostMapping(path = "/rswebpaytransaction/api/webpay/v1.2/transactions", produces = { "application/json" })
    public TransactionResponseEntity initTransaction(
            @RequestHeader("Tbk-Api-Key-Id") String apiKey,
            @RequestHeader("Tbk-Api-Key-Secret") String secretKey,
            @RequestBody TransactionRequestEntity request);
}
