package com.example.WMS.dto;

import com.example.WMS.enums.GoodReceiptStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public class GoodsReceiptResponse {
    private  Long id;
    private String grnNumber;
    private LocalDateTime receivedDate;
    private GoodReceiptStatus status;

    private  String remarks;
    private List<GoodReceiptItemResponse> items;
}
