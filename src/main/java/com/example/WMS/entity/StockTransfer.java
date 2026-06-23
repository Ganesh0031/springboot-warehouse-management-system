package com.example.WMS.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class StockTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long transferNumber;
    @ManyToOne
    @Column(name = "sourceWareHouse_id",nullable = false)
    private  Warehouse sourceWareHouse_id;
    @ManyToOne
    @Column(name = "destinationWareHouse_id",nullable = false)
    private Warehouse destinationWarehouse_id;

    private LocalDateTime transferDate;
    private String remarks;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    @OneToMany(
            mappedBy = "stockTransfer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<StockTransferItem> stockItem;
    @PrePersist
    public void setCreateAt(){
        this.createAt=LocalDateTime.now();
    }
    @PreUpdate
    public void setUpdateAt(){
        this.updateAt=LocalDateTime.now();
    }
}
