package com.morais.cleanarch.dataprovider.product.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float  price;

    @Column(name = "image_url")
    private String imageUrl;
}
