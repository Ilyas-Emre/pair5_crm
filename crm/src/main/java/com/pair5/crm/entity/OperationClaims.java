package com.pair5.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "operation_claims")
public class OperationClaims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "operationClaim")
    @JsonIgnore
    private List<RoleOperationClaims> roleOperationClaims;

    @OneToMany(mappedBy = "operationClaim")
    @JsonIgnore
    private List<EmployeeOperationClaims> employeeOperationClaims;
}
