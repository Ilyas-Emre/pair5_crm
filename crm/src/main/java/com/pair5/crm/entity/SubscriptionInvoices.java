package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subscription_invoices")
public class SubscriptionInvoices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoices invoice;

    @OneToOne
    @JoinColumn(name = "subscription_id")
    private Subscriptions subscription;

}
