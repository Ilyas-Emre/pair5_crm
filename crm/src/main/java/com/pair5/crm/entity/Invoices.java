package com.pair5.crm.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
public class Invoices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "payment_type_id")
    private PaymentTypes paymentType;

    @ManyToOne
    @JoinColumn(name = "invoice_types")
    private InvoiceTypes invoiceType;
}
