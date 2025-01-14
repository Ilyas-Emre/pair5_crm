package com.pair5.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "segmentation_types")
public class SegmentationTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "segmentationType")
    @JsonIgnore
    private List<Customers> customers;

    @OneToMany(mappedBy = "segmentationType")
    @JsonIgnore
    private List<Campaigns> campaigns;
}
