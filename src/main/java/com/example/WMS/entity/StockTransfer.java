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

    public StockTransfer() {
    }

    public StockTransfer(Long id, Long transferNumber, Warehouse sourceWarehouse, Warehouse destinationWarehouse, LocalDateTime transferDate, String remarks, List<StockTransferItem> stockItem) {
        this.id = id;
        this.transferNumber = transferNumber;
        this.sourceWarehouse = sourceWarehouse;
        this.destinationWarehouse = destinationWarehouse;
        this.transferDate = transferDate;
        this.remarks = remarks;
        this.stockItem = stockItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransferNumber() {
        return transferNumber;
    }

    public void setTransferNumber(Long transferNumber) {
        this.transferNumber = transferNumber;
    }

    public Warehouse getSourceWarehouse() {
        return sourceWarehouse;
    }

    public void setSourceWarehouse(Warehouse sourceWarehouse) {
        this.sourceWarehouse = sourceWarehouse;
    }

    public Warehouse getDestinationWarehouse() {
        return destinationWarehouse;
    }

    public void setDestinationWarehouse(Warehouse destinationWarehouse) {
        this.destinationWarehouse = destinationWarehouse;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<StockTransferItem> getStockItem() {
        return stockItem;
    }

    public void setStockItem(List<StockTransferItem> stockItem) {
        this.stockItem = stockItem;
    }
}
