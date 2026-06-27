package com.example.WMS.entity;

import com.example.WMS.enums.ProductCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
@Entity
@Table(name="products")
public class Product  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotBlank
    private String name;
    @Column(nullable = false)
    @DecimalMin("0.01")
    private BigDecimal unitPrice;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductCategory category;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Inventory> inventories;
    @OneToMany(mappedBy = "product")
    private List<PurchaseOrderItem> purchaseOrderItems;
    @OneToMany(mappedBy = "product")
    private List<SalesOrderItem> salesOrderItems;
    @OneToMany(mappedBy = "product")
    private List<StockTransferItem> stockTransferItems;
    @OneToMany(mappedBy = "product")
    private List<GoodReceiptItem>goodReceiptItems;
    @OneToMany(mappedBy = "product")
    private List<InventoryTransaction>inventoryTransactions;

}
