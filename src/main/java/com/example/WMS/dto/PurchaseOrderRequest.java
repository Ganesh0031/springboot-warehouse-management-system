package com.example.WMS.dto;

import com.example.WMS.entity.GoodsReceipt;
import com.example.WMS.entity.PurchaseOrderItem;
import com.example.WMS.entity.Supplier;
import com.example.WMS.enums.PurchaseOrderStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class PurchaseOrderRequest {
    @NotBlank(message = "PoNumber is required")
    private String poNumber;
    @NotBlank(message = "atLeast 1 status is required")
    private PurchaseOrderStatus status;
    @NotNull(message = "Supplier Id is required")
    private Supplier supplier_id;

    List<PurchaseOrderItemR>purchaseOrderItems;

}
