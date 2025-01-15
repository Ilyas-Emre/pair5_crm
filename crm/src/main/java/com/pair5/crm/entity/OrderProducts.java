package com.pair5.crm.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@IdClass(OrderProductsId.class)
@Table(name = "order_products")
public class OrderProducts {

    /*@Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orderId;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products productId;*/

    @Id
    @Column(name = "order_id", insertable = false, updatable = false)
    private Integer orderId;

    @Id
    @Column(name = "product_id", insertable = false, updatable = false)
    private Integer productId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Products product;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

}
