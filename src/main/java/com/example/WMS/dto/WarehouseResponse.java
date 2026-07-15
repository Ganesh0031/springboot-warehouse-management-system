package com.example.WMS.dto;

import com.example.WMS.entity.Inventory;
import com.example.WMS.entity.InventoryTransaction;
import com.example.WMS.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class WarehouseResponse {

    private Long id;

    private String name;
    private String address;

    private String pinCode;

}
