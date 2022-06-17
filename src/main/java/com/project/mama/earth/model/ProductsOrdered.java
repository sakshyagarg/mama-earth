package com.project.mama.earth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductsOrdered {
    @Id
    private Long orderId;
    private String username;
    private String productName;
    private Long quantity;
    private Long price;
}
