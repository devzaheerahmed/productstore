package com.store.productstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "amazondata")
public class AmazonData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "producttitle")
    private String productTitle;

    @Column(name = "productmodel")
    private String productModel;

    @Column(name = "productprice")
    private float productPrice;

    @Column(name = "productsize")
    private int productSize;

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductSize(int productSize) {
        this.productSize = productSize;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getProductModel() {
        return productModel;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public int getProductSize() {
        return productSize;
    }
    @Override
    public String toString() {
        return "AmazonData{" +
                ", productTitle='" + productTitle + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productPrice=" + productPrice +
                ", productSize=" + productSize +
                '}';
    }
}
