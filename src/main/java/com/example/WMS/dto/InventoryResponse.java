package com.example.WMS.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class InventoryResponse {
    private Long id;
private Long productId;
private String productName;
    private Long warehouseId;
    private String warehouseName;


    private Integer quantity;

    private Integer reservedQuantity ;

    private Integer availableQuantity;

}
