package com.pair5.crm.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "campaigns")
public class Campaigns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "segmentation_id")
    private SegmentationTypes segmentationType;
}
