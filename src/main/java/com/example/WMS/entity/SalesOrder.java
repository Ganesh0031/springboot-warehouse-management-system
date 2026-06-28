package com.example.WMS.entity;

import com.example.WMS.enums.SalesOrderStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class SalesOrder extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String orderNumber;
    private String customerName;
    private LocalDateTime orderDate;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SalesOrderStatus status;
    private BigDecimal totalAmount;

    @OneToMany(
            mappedBy = "salesOrder"
            ,cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SalesOrderItem>items;

    public SalesOrder(Long id, String orderNumber, String customerName, LocalDateTime orderDate, SalesOrderStatus status, BigDecimal totalAmount, List<SalesOrderItem> items) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public SalesOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public SalesOrderStatus getStatus() {
        return status;
    }

    public void setStatus(SalesOrderStatus status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<SalesOrderItem> getItems() {
        return items;
    }

    public void setItems(List<SalesOrderItem> items) {
        this.items = items;
    }
}
