package nl.mitw.ch13.simon.fridge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Simon Hiemstra
 * Purpose: reprisents an item that can be placed or removed from the fridge
 **/
@Entity
public class Item {
    private String name;
    private String catagory;
    private String brand;
    @Id @GeneratedValue
    private long itemId;



    public Item(String name, String catagory, String brand) {
        this.name = name;
        this.catagory = catagory;
        this.brand = brand;
    }

    public Item() {
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

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}
