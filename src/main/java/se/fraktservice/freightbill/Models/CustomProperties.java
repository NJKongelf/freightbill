package se.fraktservice.freightbill.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
public class CustomProperties {

    private String apiKey;
    public CustomProperties(){

    }
    public CustomProperties(String apiKey) {
        this.apiKey = apiKey;
    }

    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
