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

    public Product(Long id, String name, BigDecimal unitPrice, ProductCategory category, List<Inventory> inventories, List<PurchaseOrderItem> purchaseOrderItems, List<SalesOrderItem> salesOrderItems, List<StockTransferItem> stockTransferItems, List<GoodReceiptItem> goodReceiptItems, List<InventoryTransaction> inventoryTransactions) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.category = category;
        this.inventories = inventories;
        this.purchaseOrderItems = purchaseOrderItems;
        this.salesOrderItems = salesOrderItems;
        this.stockTransferItems = stockTransferItems;
        this.goodReceiptItems = goodReceiptItems;
        this.inventoryTransactions = inventoryTransactions;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }

    public List<PurchaseOrderItem> getPurchaseOrderItems() {
        return purchaseOrderItems;
    }

    public void setPurchaseOrderItems(List<PurchaseOrderItem> purchaseOrderItems) {
        this.purchaseOrderItems = purchaseOrderItems;
    }

    public List<SalesOrderItem> getSalesOrderItems() {
        return salesOrderItems;
    }

    public void setSalesOrderItems(List<SalesOrderItem> salesOrderItems) {
        this.salesOrderItems = salesOrderItems;
    }

    public List<StockTransferItem> getStockTransferItems() {
        return stockTransferItems;
    }

    public void setStockTransferItems(List<StockTransferItem> stockTransferItems) {
        this.stockTransferItems = stockTransferItems;
    }

    public List<GoodReceiptItem> getGoodReceiptItems() {
        return goodReceiptItems;
    }

    public void setGoodReceiptItems(List<GoodReceiptItem> goodReceiptItems) {
        this.goodReceiptItems = goodReceiptItems;
    }

    public List<InventoryTransaction> getInventoryTransactions() {
        return inventoryTransactions;
    }

    public void setInventoryTransactions(List<InventoryTransaction> inventoryTransactions) {
        this.inventoryTransactions = inventoryTransactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
