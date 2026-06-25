package com.example.WMS.entity;

import com.example.WMS.enums.GoodReceiptStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.JoinColumnOrFormula;

import java.time.LocalDateTime;

@Entity
public class GoodsReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String grnNumber;

    private LocalDateTime receivedDate;
    @Enumerated(EnumType.STRING)
    private GoodReceiptStatus status;
    private  String remarks;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="purchase_order_id",nullable = false)
    private PurchaseOrder purchaseOrder;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    @PrePersist
    public void setCreateAt(){
        this.createAt=LocalDateTime.now();

    }
    @PreUpdate
    public void setUpdateAt(){
        this.updateAt=LocalDateTime.now();
    }
}
