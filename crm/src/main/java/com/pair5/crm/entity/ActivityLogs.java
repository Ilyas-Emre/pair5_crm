package com.pair5.crm.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "activity_logs")
public class ActivityLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "activity")
    private String activity;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employees employee;

}
