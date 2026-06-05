package com.example.WMS.entity;

import com.example.WMS.enums.PurchaseOrderStatus;
import jakarta.persistence.*;
import jdk.jshell.Snippet;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String poNumber;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PurchaseOrderStatus status;
    private LocalDateTime orderDate;
    private LocalDateTime updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id",nullable = false)
    private Supplier supplier;

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL)
    List<PurchaseOrderItem>purchaseOrderItems;
    @PrePersist
    public void orderAt(){
        orderDate=LocalDateTime.now();
    }
    @PreUpdate
    public void updatAt(){
        updatedAt=LocalDateTime.now();
    }
}
