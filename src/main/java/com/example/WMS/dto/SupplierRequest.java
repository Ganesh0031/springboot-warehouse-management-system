package com.example.WMS.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SupplierRequest {

    @NotBlank(message = "SupplierCode is required")
    private String supplierCode;

    @NotBlank(message = "Supplier name is required")
    private String name;
    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^[0-9]{10}$",message = "Mobile number must contain exactly 10 digits")
    private String mobileNumber;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email formate")
    private String email;

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

    public SupplierRequest() {
    }

    public SupplierRequest(String supplierCode, String name, String mobileNumber, String email) {
        this.supplierCode = supplierCode;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }
}
