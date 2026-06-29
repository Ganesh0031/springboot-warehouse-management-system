package com.example.WMS.dto;

import com.example.WMS.enums.ProductCategory;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProductUpdateRequest {
    @NotBlank
    private String name;
    @NotNull
    @DecimalMin("0.01")
    private BigDecimal unitPrice;
    @NotNull
    private ProductCategory category;

    public ProductUpdateRequest() {
    }

    public ProductUpdateRequest(String name, BigDecimal unitPrice, ProductCategory category) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
