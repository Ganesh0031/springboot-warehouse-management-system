package com.example.WMS.entity;

import com.example.WMS.enums.ReferenceType;
import com.example.WMS.enums.TransactionType;

import java.time.LocalDateTime;

public class InventoryTransaction {
    private Long id;
    private Product product_id;
    private Warehouse warehouse_id;
    private TransactionType transactionType;
    private Integer quantity;
    private ReferenceType referenceType;
    private Long referenceId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private String remark;

}
