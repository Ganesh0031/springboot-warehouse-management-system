package com.example.WMS.entity;

import com.example.WMS.enums.ProductCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Column(nullable = false)
    private BigDecimal productPrice;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductCategory category;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Inventory> inventories;
    @PrePersist
    public  void onCreate(){
        createdDate=LocalDateTime.now();
    }
    @PreUpdate
    public void onUpdate(){
        updatedDate=LocalDateTime.now();
    }
}
