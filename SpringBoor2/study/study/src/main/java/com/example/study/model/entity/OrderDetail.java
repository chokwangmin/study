package com.example.study.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderAt;  // order_at
    private String status;
    private LocalDateTime arrivalDate;
    private Integer quantity;
    private BigDecimal totalPrice;

    @CreatedDate
    private LocalDateTime createdAt;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private LocalDateTime updateAt;
    @LastModifiedBy
    private String updateBy;

//OrderDetail N : 1 OrderGroup

    @ManyToOne
    private OrderGroup orderGroup;

    //OrderDetail N : 1 Item

    @ManyToOne
    private Item item;
}
