package com.example.WMS.dto;

import com.example.WMS.entity.GoodsReceipt;
import com.example.WMS.entity.Product;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class GoodReceiptItemRequest {
    
    private Long goodsReceipt;
    private Long product;

    private Integer orderedQuantity;
    private Integer receivedQuantity;
    private BigDecimal unitPrice;
}
