package com.pair5.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerNotificationsId implements Serializable {

    private Integer customerId;

    private Integer notificationId;

}
