package se.fraktservice.freightbill.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
public class CustomProperties {

    private String apiKey;
    private String mailHost;
    private String mailUser;
    private String mailPass;
    private String mailPort;

    public CustomProperties(){

    }
    public CustomProperties(String apiKey) {
        this.apiKey = apiKey;
    }

    public CustomProperties(String apiKey, String mailHost, String mailUser, String mailPass,String mailPort) {
        this.apiKey = apiKey;
        this.mailHost = mailHost;
        this.mailUser = mailUser;
        this.mailPass = mailPass;
        this.mailPort= mailPort;
    }

    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    @JsonProperty("mailHost")
    public String getMailHost() {
        return mailHost;
    }
    @JsonProperty("mailUser")
    public String getMailUser() {
        return mailUser;
    }
    @JsonProperty("mailPass")
    public String getMailPass() {
        return mailPass;
    }
    @JsonProperty("mailPort")
    public String getMailPort() {
        return mailPort;
    }

    @JsonProperty("apiKey")
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @JsonProperty("mailHost")
    public void setMailHost(String mailHost) {
        this.mailHost = mailHost;
    }

    @JsonProperty("mailUser")
    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }
    @JsonProperty("mailPass")
    public void setMailPass(String mailPass) {
        this.mailPass = mailPass;
    }
    @JsonProperty("mailPort")
    public void setMailPort(String mailPort) {
        this.mailPort = mailPort;
    }
}
