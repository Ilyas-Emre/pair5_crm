package com.pair5.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "subscription_packages")
public class SubscriptionPackages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private PlanTypes planType;

    @OneToMany(mappedBy = "subscriptionPackage")
    @JsonIgnore
    private List<Subscriptions> subscriptions;
}
