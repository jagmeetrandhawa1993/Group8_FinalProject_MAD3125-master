package com.example.group8_finalproject_w2019_mad3125.Modal;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String productname;
    private String productId;
    private String Quantity;
    private double unitcost;
    private double subtotal;
    private String productimage;
    private List<Cart> clist= new ArrayList<>();

    public List<Cart> getClist() {
        return clist;
    }

    public void setClist(List<Cart> clist) {
        this.clist = clist;
    }

    public Cart() {

        this.productname = "";
        this.productId = "";
        this.Quantity = "";
        this.unitcost = 0.0;
        this.subtotal = 0.0;
        this.productimage = "";

    }



    public Cart(String productname, String productId, String quantity, double unitcost, double subtotal, String productimage) {
        this.productname = productname;
        this.productId = productId;
        this.Quantity = quantity;
        this.unitcost = unitcost;
        this.subtotal = subtotal;
        this.productimage = productimage;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public double getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(double unitcost) {
        this.unitcost = unitcost;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "productname='" + productname + '\'' +
                ", productId='" + productId + '\'' +
                ", Quantity='" + Quantity + '\'' +
                ", unitcost=" + unitcost +
                ", subtotal=" + subtotal +
                ", productimage='" + productimage + '\'' +
                ", clist=" + clist +
                '}';
    }
    public void addtocart(Cart c)
    {
        this.clist.add(c);
        /*for(Cart co:this.clist)
        {
            Log.d("ss",co.getProductname());
        }*/
    }


}
