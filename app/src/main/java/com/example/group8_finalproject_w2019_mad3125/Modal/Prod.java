package com.example.group8_finalproject_w2019_mad3125.Modal;

import java.io.Serializable;

public class Prod implements Serializable {

    private String productId;
    private String name;
    private String price;
    private  String desc;


    public Prod(String productId, String name, String price, String desc) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return price;
    }

    public void setQuantity(String quantity) {
        this.price = quantity;
    }

    public String getImg() {
        return desc;
    }

    public void setImg(String img) {
        this.desc = img;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", quantity='" + price + '\'' +
                ", img='" + desc + '\'' +
                '}';
    }


}

