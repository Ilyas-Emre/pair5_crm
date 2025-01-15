package com.pair5.crm.entity;

import jakarta.persistence.*;

@Entity
@IdClass(CustomerNotificationsId.class)
@Table(name = "customer_notifications")
public class CustomerNotifications {

    @Id
    @Column(name = "customer_id", insertable = false, updatable = false)
    private Integer customerId;

    @Id
    @Column(name = "notification_id", insertable = false, updatable = false)
    private Integer notificationId;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Customers customer;

    @ManyToOne
    @JoinColumn(name = "notification_id", referencedColumnName = "id", insertable = false, updatable = false)
    private NotificationTypes notificationType;

    @Column(name = "status")
    private String status;

}
