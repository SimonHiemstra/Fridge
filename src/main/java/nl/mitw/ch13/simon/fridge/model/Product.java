package nl.mitw.ch13.simon.fridge.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

/**
 * @author Simon Hiemstra
 * Purpose: reprisents a product that could be in the fridge
 **/
@Entity
public class Product {
    private String name;
    private String catagory;
    private String brand;
    @Id @GeneratedValue
    private long ProductId;

    @ManyToMany
    private Set<Brand> brands;

    @OneToMany(mappedBy = "product")
    private List<Item> items;


    public int getNumberOfItemsInFridge() {
        int count = 0;

        for (Item item : items) {
            if (item.getInhoud() > 0) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfItems() {
        return items.size();
    }

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
        ProductId = productId;
    }

    public Set<Brand> getBrands() {
        return brands;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }
}
