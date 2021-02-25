package se.fraktservice.freightbill.Models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class IncommingRequestDataJsonFreight {
    private CustomProperties CustomProperties;
    private Model Model;

    public IncommingRequestDataJsonFreight(){

    }

    public IncommingRequestDataJsonFreight(CustomProperties CustomProperties, Model Model) {
        this.CustomProperties = CustomProperties;
        this.Model = Model;
    }
    @JsonProperty("CustomProperties")
    public CustomProperties getCustomProperties() {
        return CustomProperties;
    }

    public void setCustomProperties(CustomProperties customProperties) {
        this.CustomProperties = customProperties;
    }
    @JsonProperty("Model")
    public Model getModel() {
        return Model;
    }

    public void setModel(Model model) {
        this.Model = model;
    }
}
