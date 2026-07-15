package com.example.WMS.dto;

import com.example.WMS.entity.Product;
import com.example.WMS.entity.Warehouse;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class InventoryRequest {

     @NotNull(message = "Product Id is required")
    private Long productId;
     @NotNull(message = "Warehouse Id is required")
    private Long warehouseId;
    @NotNull(message = "Quanity is required")
    @Min(value = 0,message = "Quantity cannot be negative")
    private Integer quantity;
    @NotNull(message = "Reserved quantity is required")
    private Integer reservedQuantity = 0;
    @NotNull(message = "Reserved quanity is required")
    @Min(value =0,message = "Reserved quantity cannot be negative")
    private Integer availableQuantity;

}
