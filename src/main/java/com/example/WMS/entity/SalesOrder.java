package com.example.WMS.entity;

import com.example.WMS.enums.SalesOrderStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class SalesOrder {
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
    private  LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToMany(
            mappedBy = "salesOrder"
            ,cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SalesOrderItem>items;
   @PrePersist
    public void preCreateDate(){
        this.createdAt=LocalDateTime.now();
    }
    @PreUpdate
    public void onUpdateDate(){
       this.updatedAt=LocalDateTime.now();
    }
}
