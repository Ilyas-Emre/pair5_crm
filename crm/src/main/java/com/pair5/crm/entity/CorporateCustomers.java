package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "corporate_customers")
public class CorporateCustomers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tax_no")
    private String taxNo;

    @Column(name = "corporate_name")
    private String corporateName;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;
}
