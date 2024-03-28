package nl.mitw.ch13.simon.fridge.model;


import jakarta.persistence.*;

import java.util.Set;

/**
 * @author Simon Hiemstra
 * Purpose: Reprisents a company that produces a product or products
 **/
@Entity
public class Brand {
    @Id @GeneratedValue
    private Long brandId;
    private String brandName;


    @ManyToMany(mappedBy = "productBrands")
    Set<Product> hasBrand;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Set<Product> getHasBrand() {
        return hasBrand;
    }

    public void setHasBrand(Set<Product> hasBrand) {
        this.hasBrand = hasBrand;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
