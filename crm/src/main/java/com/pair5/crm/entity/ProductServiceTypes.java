package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_service_types")
public class ProductServiceTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
