package com.example.group8_finalproject_w2019_mad3125.Modal;

import java.io.Serializable;

public class Prod implements Serializable {

    private String productId;
    private String name;
    private String price;
    private  String img;


    public Prod(String productId, String name, String price, String img) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.img = img;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", quantity='" + price + '\'' +
                ", img='" + img + '\'' +
                '}';
    }


}

