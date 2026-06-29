package com.example.WMS.dto;

public class SupplierResponse {
    private Long id;
    private String supplierCode;
    private String name;
    private String mobileNumber;
    private String email;

    public SupplierResponse() {
    }

    public SupplierResponse(Long id, String supplierCode, String name, String mobileNumber, String email) {
        this.id = id;
        this.supplierCode = supplierCode;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
