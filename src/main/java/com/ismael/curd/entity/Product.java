package com.ismael.curd.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "PRODUCT_TBL")

public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantit;
    private double price;
}
