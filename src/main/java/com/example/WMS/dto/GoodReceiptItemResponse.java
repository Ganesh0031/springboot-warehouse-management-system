package com.example.WMS.dto;

import java.math.BigDecimal;

public class GoodReceiptItemResponse {
    private Long id;
    private Long goodsReceipt;
    private Long product;

    private Integer orderedQuantity;
    private Integer receivedQuantity;
    private BigDecimal unitPrice;
}
