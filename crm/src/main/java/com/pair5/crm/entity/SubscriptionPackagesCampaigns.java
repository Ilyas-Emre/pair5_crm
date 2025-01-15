package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(SubscriptionPackagesCampaignsId.class)
@Table(name = "subscription_packages_campaigns")
public class SubscriptionPackagesCampaigns {

    @Id
    @Column(name = "subscription_package_id", insertable = false, updatable = false)
    private Integer subscriptionPackageId;

    @Id
    @Column(name = "campaign_id", insertable = false, updatable = false)
    private Integer campaignId;

    @ManyToOne
    @JoinColumn(name = "subscription_package_id", referencedColumnName = "id", insertable = false, updatable = false)
    private SubscriptionPackages subscriptionPackage;

    @ManyToOne
    @JoinColumn(name = "campaign_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Campaigns campaign;

    @Column(name = "status")
    private String status;


}
