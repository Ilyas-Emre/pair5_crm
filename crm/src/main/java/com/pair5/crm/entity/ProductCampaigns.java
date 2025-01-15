package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@IdClass(ProductCampaignsId.class)
@Table(name = "product_campaigns")
public class ProductCampaigns {

    @Id
    @Column(name = "product_id", insertable = false, updatable = false)
    private Integer productId;

    @Id
    @Column(name = "campaign_id", insertable = false, updatable = false)
    private Integer campaignId;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Products product;

    @ManyToOne
    @JoinColumn(name = "campaign_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Campaigns campaign;

    @Column(name = "status")
    private String status;

}
