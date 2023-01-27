package cl.duoc.transbank.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionResponseEntity {

    @JsonProperty("token")
    private String token;
    @JsonProperty("url")
    private String url;

    public TransactionResponseEntity() {

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}