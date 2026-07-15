package com.example.WMS.dto;

import com.example.WMS.entity.GoodReceiptItem;
import com.example.WMS.entity.PurchaseOrder;
import com.example.WMS.enums.GoodReceiptStatus;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public class GoodsReceiptRequest {

    @NotBlank(message = "GRN Number is required")
    private String grnNumber;
    @NotNull(message = "Received date is required")
    private LocalDateTime receivedDate;
     @NotNull(message = "At least one item is required")
    private GoodReceiptStatus status;

    private  String remarks;
    @NotEmpty(message = "At least one item is required")
    @Valid
    private List<GoodReceiptItemRequest> items;
}
