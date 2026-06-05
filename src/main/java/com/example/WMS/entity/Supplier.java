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
public class Supplier {
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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
    private List<PurchaseOrder>purchaseOrders=new ArrayList<>();
    @PrePersist
    public void createdOn(){
        this.createdAt=LocalDateTime.now();
    }
    @PreUpdate
    public void updatedOn(){
        this.updatedAt=LocalDateTime.now();
    }
}
