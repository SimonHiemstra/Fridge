package nl.mitw.ch13.simon.fridge.model;

import jakarta.persistence.*;

/**
 * @author Simon Hiemstra
 * Purpose:
 **/
@Entity
public class Item {
    @Id @GeneratedValue
    private Long itemId;

    private int inhoud = 100;

    @ManyToOne
    private Product product;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public int getInhoud() {
        return inhoud;
    }

    public void setInhoud(int inhoud) {
        this.inhoud = inhoud;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
