package com.pair5.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProductServiceTypes productServiceType;

    @OneToMany(mappedBy = "productId")
    @JsonIgnore
    private List<OrderProducts> orderProducts;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<ProductCampaigns> productCampaigns;
}
