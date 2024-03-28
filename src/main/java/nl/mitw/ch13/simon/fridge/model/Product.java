package nl.mitw.ch13.simon.fridge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Simon Hiemstra
 * Purpose: reprisents an item that can be placed or removed from the fridge
 **/
@Entity
public class Product {
    private String name;
    private String catagory;
    private String brand;
    @Id @GeneratedValue
    private long ProductId;



    public Product(String name, String catagory, String brand) {
        this.name = name;
        this.catagory = catagory;
        this.brand = brand;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        this.ProductId = productId;
    }
}
