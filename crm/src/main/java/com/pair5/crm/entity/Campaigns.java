package com.pair5.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @OneToMany(mappedBy = "campaign")
    @JsonIgnore
    private List<SubscriptionPackagesCampaigns> subscriptionPackagesCampaigns;

    @OneToMany(mappedBy = "campaign")
    @JsonIgnore
    private List<ProductCampaigns> productCampaigns;

}
