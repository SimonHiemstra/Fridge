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

    private String name;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
