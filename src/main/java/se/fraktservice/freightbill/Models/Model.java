package se.fraktservice.freightbill.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Model {

    //<editor-fold desc="Fields">
    private String SenderName;
    private String SenderCountry;
    private String SenderCity;
    private String SenderZip;
    private String SenderStreet;
    private String SenderPhone;
    private String SenderReference;
    private String ReceiverName;
    private String ReceiverCountry;
    private String ReceiverCity;
    private String ReceiverZip;
    private String ReceiverStreet;
    private String ReceiverPhone;
    private String ReceiverReference;
    private String Transporter;
    private String FreightBillNumber;
    private String TransportInstructions;
    private String TransportInstructionsCode;
    private String DeliveryInstructions;
    private String SummaryTotalGrossWeight;
    private String SummaryTypeCode;
    private String SummaryTypeValue;
    private String SendFreightBillToEmail;
    private String PaymentResponsibility;
    private String SummaryTotalColli;
    private Collection<FreightBillRows> freightBillRows= new ArrayList<>();
    //</editor-fold>

    //<editor-fold desc="Constructs">
    public Model() {
    }

    public Model(String senderName, String senderCountry,
                 String senderCity,
                 String senderZip,
                 String senderStreet,
                 String senderPhone,
                 String senderReference,
                 String receiverName,
                 String receiverCountry,
                 String receiverCity,
                 String receiverZip,
                 String receiverStreet,
                 String receiverPhone,
                 String receiverReference,
                 String transporter,
                 String freightBillNumber,
                 String transportInstructions,
                 String transportInstructionsCode,
                 String deliveryInstructions,
                 String summaryTotalGrossWeight,
                 String summaryTypeCode,
                 String summaryTypeValue,
                 String sendFreightBillToEmail,
                 String paymentResponsibility, String  summaryTotalColli, List<FreightBillRows> freightBillRows) {
        SenderName = senderName;
        SenderCountry = senderCountry;
        SenderCity = senderCity;
        SenderZip = senderZip;
        SenderStreet = senderStreet;
        SenderPhone = senderPhone;
        SenderReference = senderReference;
        ReceiverName = receiverName;
        ReceiverCountry = receiverCountry;
        ReceiverCity = receiverCity;
        ReceiverZip = receiverZip;
        ReceiverStreet = receiverStreet;
        ReceiverPhone = receiverPhone;
        ReceiverReference = receiverReference;
        Transporter = transporter;
        FreightBillNumber = freightBillNumber;
        TransportInstructions = transportInstructions;
        TransportInstructionsCode = transportInstructionsCode;
        DeliveryInstructions = deliveryInstructions;
        SummaryTotalGrossWeight = summaryTotalGrossWeight;
        SummaryTypeCode = summaryTypeCode;
        SummaryTypeValue = summaryTypeValue;
        SendFreightBillToEmail = sendFreightBillToEmail;
        PaymentResponsibility = paymentResponsibility;
        SummaryTotalColli = summaryTotalColli;
        this.freightBillRows = freightBillRows;
    }
    //</editor-fold>

    //<editor-fold desc="Getters">
    @JsonProperty("SenderName")
    public String getSenderName() {
        return SenderName;
    }
    @JsonProperty("SenderCountry")
    public String getSenderCountry() {
        return SenderCountry;
    }
    @JsonProperty("SenderCity")
    public String getSenderCity() {
        return SenderCity;
    }
    @JsonProperty("SenderZip")
    public String getSenderZip() {
        return SenderZip;
    }
    @JsonProperty("SenderStreet")
    public String getSenderStreet() {
        return SenderStreet;
    }
    @JsonProperty("SenderPhone")
    public String getSenderPhone() {
        return SenderPhone;
    }
    @JsonProperty("SenderReference")
    public String getSenderReference() {
        return SenderReference;
    }
    @JsonProperty("ReceiverName")
    public String getReceiverName() {
        return ReceiverName;
    }
    @JsonProperty("ReceiverCountry")
    public String getReceiverCountry() {
        return ReceiverCountry;
    }
    @JsonProperty("ReceiverCity")
    public String getReceiverCity() {
        return ReceiverCity;
    }
    @JsonProperty("ReceiverZip")
    public String getReceiverZip() {
        return ReceiverZip;
    }
    @JsonProperty("ReceiverStreet")
    public String getReceiverStreet() {
        return ReceiverStreet;
    }
    @JsonProperty("ReceiverPhone")
    public String getReceiverPhone() {
        return ReceiverPhone;
    }
    @JsonProperty("ReceiverReference")
    public String getReceiverReference() {
        return ReceiverReference;
    }
    @JsonProperty("Transporter")
    public String getTransporter() {
        return Transporter;
    }
    @JsonProperty("FreightBillNumber")
    public String getFreightBillNumber() {
        return FreightBillNumber;
    }
    @JsonProperty("TransportInstructions")
    public String getTransportInstructions() {
        return TransportInstructions;
    }
    @JsonProperty("TransportInstructionsCode")
    public String getTransportInstructionsCode() {
        return TransportInstructionsCode;
    }
    @JsonProperty("DeliveryInstructions")
    public String getDeliveryInstructions() {
        return DeliveryInstructions;
    }
    @JsonProperty("SummaryTotalGrossWeight")
    public String getSummaryTotalGrossWeight() {
        return SummaryTotalGrossWeight;
    }
    @JsonProperty("SummaryTypeCode")
    public String getSummaryTypeCode() {
        return SummaryTypeCode;
    }
    @JsonProperty("SummaryTypeValue")
    public String getSummaryTypeValue() {
        return SummaryTypeValue;
    }
    @JsonProperty("SendFreightBillToEmail")
    public String getSendFreightBillToEmail() {
        return SendFreightBillToEmail;
    }
    @JsonProperty("PaymentResponsibility")
    public String getPaymentResponsibility() {
        return PaymentResponsibility;
    }
    @JsonProperty("SummaryTotalColli")
    public String getSummaryTotalColli() {
        return SummaryTotalColli;
    }
    @JsonProperty("FreightBillRows")
    public Collection<FreightBillRows> getFreightBillRows() {
        return freightBillRows;
    }
    @JsonIgnore
    public HashMap<String,Object> getParameters(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("SenderName",this.SenderName);
        map.put("SenderCountry",this.SenderCountry);
        map.put("SenderCity",this.SenderCity);
        map.put("SenderZip",this.SenderZip);
        map.put("SenderStreet",this.SenderStreet);
        map.put("SenderPhone",this.SenderPhone);
        map.put("SenderReference",this.SenderReference);
        map.put("ReceiverName",this.ReceiverName);
        map.put("ReceiverCountry",this.ReceiverCountry);
        map.put("ReceiverCity",this.ReceiverCity);
        map.put("ReceiverZip",this.ReceiverZip);
        map.put("ReceiverStreet",this.ReceiverStreet);
        map.put("ReceiverPhone",this.ReceiverPhone);
        map.put("ReceiverReference",this.ReceiverReference);
        map.put("Transporter",this.Transporter);
        map.put("FreightBillNumber",this.FreightBillNumber);
        map.put("TransportInstructions",this.TransportInstructions);
        map.put("TransportInstructionsCode",this.TransportInstructionsCode);
        map.put("DeliveryInstructions",this.DeliveryInstructions);
        map.put("SummaryTotalGrossWeight",this.SummaryTotalGrossWeight);
        map.put("SummaryTypeCode",this.SummaryTypeCode);
        map.put("SummaryTypeValue",this.SummaryTypeValue);
        map.put("PaymentResponsibility",this.PaymentResponsibility);
        map.put("SummaryTotalColli",this.SummaryTotalColli);
        return map;
    }
    //</editor-fold>

    //<editor-fold desc="Setters">
    public void setSenderName(String senderName) {
        SenderName = senderName;
    }
    public void setSenderCountry(String senderCountry) {
        SenderCountry = senderCountry;
    }
    public void setSenderCity(String senderCity) {
        SenderCity = senderCity;
    }
    public void setSenderZip(String senderZip) {
        SenderZip = senderZip;
    }
    public void setSenderStreet(String senderStreet) {
        SenderStreet = senderStreet;
    }
    public void setSenderPhone(String senderPhone) {
        SenderPhone = senderPhone;
    }
    public void setSenderReference(String senderReference) {
        SenderReference = senderReference;
    }
    public void setReceiverName(String receiverName) {
        ReceiverName = receiverName;
    }
    public void setReceiverCountry(String receiverCountry) {
        ReceiverCountry = receiverCountry;
    }
    public void setReceiverCity(String receiverCity) {
        ReceiverCity = receiverCity;
    }
    public void setReceiverZip(String receiverZip) {
        ReceiverZip = receiverZip;
    }
    public void setReceiverStreet(String receiverStreet) {
        ReceiverStreet = receiverStreet;
    }
    public void setReceiverPhone(String receiverPhone) {
        ReceiverPhone = receiverPhone;
    }
    public void setReceiverReference(String receiverReference) {
        ReceiverReference = receiverReference;
    }
    public void setTransporter(String transporter) {
        Transporter = transporter;
    }
    public void setFreightBillNumber(String freightBillNumber) {
        FreightBillNumber = freightBillNumber;
    }
    public void setTransportInstructions(String transportInstructions) {
        TransportInstructions = transportInstructions;
    }
    public void setTransportInstructionsCode(String transportInstructionsCode) {
        TransportInstructionsCode = transportInstructionsCode;
    }
    public void setDeliveryInstructions(String deliveryInstructions) {
        DeliveryInstructions = deliveryInstructions;
    }
    public void setSummaryTotalGrossWeight(String summaryTotalGrossWeight) {
        SummaryTotalGrossWeight = summaryTotalGrossWeight;
    }
    public void setSummaryTypeCode(String summaryTypeCode) {
        SummaryTypeCode = summaryTypeCode;
    }
    public void setSummaryTypeValue(String summaryTypeValue) {
        SummaryTypeValue = summaryTypeValue;
    }
    public void setSendFreightBillToEmail(String sendFreightBillToEmail) {
        SendFreightBillToEmail = sendFreightBillToEmail;
    }
    public void setPaymentResponsibility(String paymentResponsibility) {
        PaymentResponsibility = paymentResponsibility;
    }
    public void setSummaryTotalColli(String summaryTotalColli) {
        SummaryTotalColli = summaryTotalColli;
    }
//    public void setFreightBillRows(List<FreightBillRows> freightBillRows) {
//        this.freightBillRows = freightBillRows;
//    }
    //</editor-fold>
}
