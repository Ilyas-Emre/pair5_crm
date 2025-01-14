package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_operation_claims")
public class RoleOperationClaims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "operation_claim_id")
    private OperationClaims operationClaim;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;



}
