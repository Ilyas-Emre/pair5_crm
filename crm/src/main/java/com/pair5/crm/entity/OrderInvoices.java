package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_invoices")
public class OrderInvoices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoices invoice;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

}
