package com.example.WMS.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jdk.jfr.Name;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long unit;
    @Column(nullable = false)
    @Size(min=1)
    private BigDecimal unitPrice;


    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "purchase_id",nullable = false)
    private PurchaseOrder purchaseOrder;
    @OneToMany(mappedBy = "purchaseItems",cascade = CascadeType.ALL)
    private List<Product>products;

}
