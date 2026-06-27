package com.example.WMS.entity;

import com.example.WMS.enums.ReferenceType;
import com.example.WMS.enums.TransactionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;
@Entity
public class InventoryTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id",nullable = false)
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id",nullable = false)
    private Warehouse warehouse;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @NotNull
    @Positive
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private ReferenceType referenceType;

    private Long referenceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by")
    private User performedBy;
    @Column(nullable = false)
    private LocalDateTime transactionDate;

    private String remark;
    @PrePersist
    public void onCreate() {
        transactionDate = LocalDateTime.now();
    }

}
