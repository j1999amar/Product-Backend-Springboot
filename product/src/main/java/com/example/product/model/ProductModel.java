package com.example.product.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class ProductModel {
    @Id
    @GeneratedValue
    private int id;
    private int ProductCode;
    private String ProductName;
    private String ManuDate;
    private String ExpDate;
    private String Brand;
    private String Price;
    private String SellarName;
    private String Distributor;

    public ProductModel() {
    }

    public ProductModel(int id, int productCode, String productName, String manuDate, String expDate, String brand, String price, String sellarName, String distributor) {
        this.id = id;
        ProductCode = productCode;
        ProductName = productName;
        ManuDate = manuDate;
        ExpDate = expDate;
        Brand = brand;
        Price = price;
        SellarName = sellarName;
        Distributor = distributor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getManuDate() {
        return ManuDate;
    }

    public void setManuDate(String manuDate) {
        ManuDate = manuDate;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        ExpDate = expDate;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getSellarName() {
        return SellarName;
    }

    public void setSellarName(String sellarName) {
        SellarName = sellarName;
    }

    public String getDistributor() {
        return Distributor;
    }

    public void setDistributor(String distributor) {
        Distributor = distributor;
    }
}
