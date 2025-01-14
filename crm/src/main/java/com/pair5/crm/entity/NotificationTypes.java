package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notification_types")
public class NotificationTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
