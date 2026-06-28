package com.example.WMS.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "suppliers")
public class Supplier  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @Column(nullable = false,unique = true)
    @NotBlank
    private String supplierCode;

    @Column(nullable = false)
    @NotBlank
    private String name;
    @Column(nullable = false, unique = true)
    @Pattern(regexp = "^[0-9]{10}$")
    private String mobileNumber;

    @Column(nullable = false,unique = true)
    @Email
    private String email;
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
    private List<PurchaseOrder>purchaseOrders=new ArrayList<>();

    public Supplier() {
    }

    public Supplier(Long id, String supplierCode, String name, String mobileNumber, String email, List<PurchaseOrder> purchaseOrders) {
        this.id = id;
        this.supplierCode = supplierCode;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.purchaseOrders = purchaseOrders;
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

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }
}
