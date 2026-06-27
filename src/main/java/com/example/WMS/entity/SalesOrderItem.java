package com.example.WMS.entity;

import com.example.WMS.enums.ProductCategory;
import com.example.WMS.enums.SalesOrderStatus;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;
@Entity
public class SalesOrderItem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private BigDecimal unitPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_order_id", nullable = false)
    private SalesOrder salesOrder;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
