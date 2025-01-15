package com.pair5.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductsId implements Serializable {

    private Integer orderId;

    private Integer productId;

}
