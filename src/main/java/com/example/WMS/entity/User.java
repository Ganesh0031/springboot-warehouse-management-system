package com.example.WMS.entity;

import com.example.WMS.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;
    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    @Column(unique = true, nullable = false)
    private String email;
    @NotBlank(message = "Password is required")
    @Column(nullable = false)
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,12}$",
            message = "Password must contain uppercase, lowercase and number"
    )
    @Size(min = 8, max = 12)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private   List<Warehouse> warehouses;

    @PrePersist
    private void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    private void onUpdate() {
        updatedAt = LocalDateTime.now();
    }


}
