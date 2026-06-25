package com.example.WMS.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
public class GoodReceiptItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_receipt_id", nullable = false)
    private GoodsReceipt goodsReceipt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private Integer orderedQuantity;
    private Integer receivedQuantity;
    private BigDecimal unitPrice;
}
