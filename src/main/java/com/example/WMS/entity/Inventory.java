package com.example.WMS.entity;

import jakarta.persistence.*;
import tools.jackson.core.ObjectReadContext;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(
        name = "inventory",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"warehouse_id", "product_id"}
                )
        }
)
public class Inventory extends BaseEntity {
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

  @PrePersist
  @PreUpdate
  public  void calculateAvailabeQuanity(){
        availableQuantity=quantity-reservedQuantity;
  }
}
