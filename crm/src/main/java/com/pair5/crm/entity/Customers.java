package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customers
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "segmentation_id")
    private int segmentationId;

    @OneToOne (mappedBy = "customer")
    private IndividualCustomers individualCustomers;

}
