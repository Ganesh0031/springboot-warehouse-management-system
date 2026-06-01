package com.example.WMS.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "warehouses")
public class Warehouse{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotBlank
    @Column(nullable = false,length = 10)
    private String pinCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @OneToMany(mappedBy = "warehouse",cascade = CascadeType.ALL)
    private List<Inventory> inventory;
    @PrePersist
    public void OnCreateAt(){
        createdAt=LocalDateTime.now();
    }
    @PreUpdate
    public void onUpdateAt(){
        updatedAt=LocalDateTime.now();
    }
}
