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
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<ActivityLogs> activityLogs;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<EmployeeOperationClaims> employeeOperationClaims;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Requests> requests;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Feedbacks> feedbacks;

}
