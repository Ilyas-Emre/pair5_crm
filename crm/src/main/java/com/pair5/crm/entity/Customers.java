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
@Table(name = "customers")
public class Customers
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne (mappedBy = "customer")
    private IndividualCustomers individualCustomer;

    @ManyToOne
    @JoinColumn(name = "segmentation_id")
    private SegmentationTypes segmentationType;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Requests> requests;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Feedbacks> feedbacks;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Subscriptions> subscriptions;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Orders> orders;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<CustomerNotifications> customerNotifications;

}
