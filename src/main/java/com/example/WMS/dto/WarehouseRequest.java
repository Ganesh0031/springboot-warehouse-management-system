package com.example.WMS.dto;

import com.example.WMS.entity.BaseEntity;
import com.example.WMS.entity.Inventory;
import com.example.WMS.entity.InventoryTransaction;
import com.example.WMS.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class WarehouseRequest {


    @NotBlank(message = "Warehouse name is required")
    private String name;
    @NotBlank(message = "Address is Required")
    private String address;
    @NotBlank(message = "PinCode is Required")
    private String pinCode;






}
