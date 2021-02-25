package se.fraktservice.freightbill.Models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.BeanProperty;
import java.beans.JavaBean;

@JavaBean
public class FreightBillRows implements java.io.Serializable{
    //<editor-fold desc="Fields">
    private Long Colli;
    private String GoodsMarking;
    private String ColliType;
    private String TypeOfGoods;
    private String GoodsNumber;
    private String GrossWeight;
    private String Volume;
    //</editor-fold>

    //<editor-fold desc="Constructs">
    public FreightBillRows() {
    }

    public FreightBillRows(Long Colli, String GoodsMarking, String ColliType, String typeOfGoods, String goodsNumber, String grossWeight, String volume) {
        this.Colli = Colli;
        this.GoodsMarking = GoodsMarking;
        this.ColliType = ColliType;
        this.TypeOfGoods = typeOfGoods;
        this.GoodsNumber = goodsNumber;
        this.GrossWeight = grossWeight;
        this.Volume = volume;
    }
    //</editor-fold>

    //<editor-fold desc="Getters">
    @JsonProperty("Colli")
    @BeanProperty(description = "Colli")
    public Long getColli() {
        return Colli;
    }
    @JsonProperty("GoodsMarking")
    public String getGoodsMarking() {
        return GoodsMarking;
    }
    @JsonProperty("ColliType")
    @BeanProperty(description = "ColliType")
    public String getColliType() {
        return ColliType;
    }
    @JsonProperty("TypeOfGoods")
    @BeanProperty(description = "TypeOfGoods")
    public String getTypeOfGoods() {
        return TypeOfGoods;
    }
    @JsonProperty("GoodsNumber")
    @BeanProperty(description = "GoodsNumber")

    public String getGoodsNumber() {
        return GoodsNumber;
    }
    @JsonProperty("GrossWeight")
    @BeanProperty(description = "GrossWeight")
    public String getGrossWeight() {
        return GrossWeight;
    }
    @JsonProperty("Volume")
    @BeanProperty(description = "Volume")
    public String getVolume() {
        return Volume;
    }
    //</editor-fold>

    //<editor-fold desc="Setters">
    public void setColli(Long colli) {
        this.Colli = colli;
    }
    public void setGoodsMarking(String goodsMarking) {
        this.GoodsMarking = goodsMarking;
    }
    public void setColliType(String colliType) {
        this.ColliType = colliType;
    }
    public void setTypeOfGoods(String typeOfGoods) {
        this.TypeOfGoods = typeOfGoods;
    }
    public void setGoodsNumber(String goodsNumber) {
        this.GoodsNumber = goodsNumber;
    }
    public void setGrossWeight(String grossWeight) {
        this.GrossWeight = grossWeight;
    }
    public void setVolume(String volume) {
        this.Volume = volume;
    }
    //</editor-fold>
}
