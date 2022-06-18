package com.project.mama.earth.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class ProductsOrdered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemsId;
    private String username;
    private String productName;
    private Long quantity;
    private Long price;
}
