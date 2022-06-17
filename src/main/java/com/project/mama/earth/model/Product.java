package com.project.mama.earth.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private Long price;
    private String category;
    private String description;
}
