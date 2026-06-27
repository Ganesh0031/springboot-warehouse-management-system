package com.example.WMS.entity;

import jakarta.persistence.*;
import tools.jackson.core.ObjectReadContext;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class StockTransfer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long transferNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_warehouse_id")
    private Warehouse sourceWarehouse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_warehouse_id")
    private Warehouse destinationWarehouse;

    private LocalDateTime transferDate;
    private String remarks;

    @OneToMany(
            mappedBy = "stockTransfer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<StockTransferItem> stockItem;

}
