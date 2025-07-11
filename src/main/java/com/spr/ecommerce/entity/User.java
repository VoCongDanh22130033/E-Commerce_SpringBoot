package com.spr.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String phone;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;
}
