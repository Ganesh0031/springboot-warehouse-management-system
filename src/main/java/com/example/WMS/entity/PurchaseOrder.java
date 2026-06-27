package com.example.WMS.entity;

import com.example.WMS.enums.PurchaseOrderStatus;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import tools.jackson.core.ObjectReadContext;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class PurchaseOrder extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String poNumber;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PurchaseOrderStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id",nullable = false)
    private Supplier supplier;
    @OneToMany(mappedBy = "purchaseOrder",
            cascade = CascadeType.ALL)
    private List<GoodsReceipt> goodsReceipts;

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL)
    List<PurchaseOrderItem>purchaseOrderItems;

}
