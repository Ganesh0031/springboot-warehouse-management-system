package com.example.WMS.entity;

import com.example.WMS.enums.GoodReceiptStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.JoinColumnOrFormula;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class GoodsReceipt extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String grnNumber;
    @Column(nullable = false)
    private LocalDateTime receivedDate;
    @Enumerated(EnumType.STRING)
    private GoodReceiptStatus status;
    private  String remarks;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="purchase_order_id",nullable = false)
    @OneToMany(
            mappedBy = "goodsReceipt",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<GoodReceiptItem> items;
    private PurchaseOrder purchaseOrder;

}
