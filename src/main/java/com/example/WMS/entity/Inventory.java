package com.example.WMS.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id",nullable = false)
    private Warehouse warehouse;
    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer reservedQuantity = 0;

    @Column(nullable = false)
    private Integer availableQuantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist
  public void createOn(){
      createdAt=LocalDateTime.now();
  }
  @PreUpdate
  public void updateOn(){
        updatedAt=LocalDateTime.now();
  }
  @PrePersist
  @PreUpdate
  public  void calculateAvailabeQuanity(){
        availableQuantity=quantity-reservedQuantity;
  }
}
