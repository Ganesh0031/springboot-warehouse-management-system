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

    public GoodsReceipt(Long id, String grnNumber, LocalDateTime receivedDate, GoodReceiptStatus status, String remarks, List<GoodReceiptItem> items, PurchaseOrder purchaseOrder) {
        this.id = id;
        this.grnNumber = grnNumber;
        this.receivedDate = receivedDate;
        this.status = status;
        this.remarks = remarks;
        this.items = items;
        this.purchaseOrder = purchaseOrder;
    }

    public GoodsReceipt() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrnNumber() {
        return grnNumber;
    }

    public void setGrnNumber(String grnNumber) {
        this.grnNumber = grnNumber;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public GoodReceiptStatus getStatus() {
        return status;
    }

    public void setStatus(GoodReceiptStatus status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<GoodReceiptItem> getItems() {
        return items;
    }

    public void setItems(List<GoodReceiptItem> items) {
        this.items = items;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
