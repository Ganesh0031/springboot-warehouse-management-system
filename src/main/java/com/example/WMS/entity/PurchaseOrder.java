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

    public PurchaseOrder(Long id, String poNumber, PurchaseOrderStatus status, Supplier supplier, List<GoodsReceipt> goodsReceipts, List<PurchaseOrderItem> purchaseOrderItems) {
        this.id = id;
        this.poNumber = poNumber;
        this.status = status;
        this.supplier = supplier;
        this.goodsReceipts = goodsReceipts;
        this.purchaseOrderItems = purchaseOrderItems;
    }

    public PurchaseOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public PurchaseOrderStatus getStatus() {
        return status;
    }

    public void setStatus(PurchaseOrderStatus status) {
        this.status = status;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<GoodsReceipt> getGoodsReceipts() {
        return goodsReceipts;
    }

    public void setGoodsReceipts(List<GoodsReceipt> goodsReceipts) {
        this.goodsReceipts = goodsReceipts;
    }

    public List<PurchaseOrderItem> getPurchaseOrderItems() {
        return purchaseOrderItems;
    }

    public void setPurchaseOrderItems(List<PurchaseOrderItem> purchaseOrderItems) {
        this.purchaseOrderItems = purchaseOrderItems;
    }
}
