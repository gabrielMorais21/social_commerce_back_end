package com.morais.cleanarch.dataprovider.productDiscount.repository.entity;

import com.morais.cleanarch.dataprovider.address.repository.entity.AddressEntity;
import com.morais.cleanarch.dataprovider.product.repository.entity.ProductEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_products_discounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductDiscountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private ProductEntity productEntity;
    @Column(name = "discount")
    private int discount;
    @Column(name = "min")
    private int min;
    @Column(name = "max")
    private int max;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
