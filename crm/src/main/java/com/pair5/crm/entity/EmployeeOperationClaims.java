package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_operation_claims")
public class EmployeeOperationClaims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "operation_claim_id")
    private OperationClaims operationClaim;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employees employee;
}
