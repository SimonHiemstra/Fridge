package nl.mitw.ch13.simon.fridge.controller;

import nl.mitw.ch13.simon.fridge.model.Item;
import nl.mitw.ch13.simon.fridge.model.Product;
import nl.mitw.ch13.simon.fridge.repositories.ItemRepository;
import nl.mitw.ch13.simon.fridge.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @author Simon Hiemstra
 * Purpose:
 **/

@Controller
public class ItemController {
    private final ProductRepository productRepository;
    private final ItemRepository itemRepository;

    public ItemController(ProductRepository productRepository, ItemRepository itemRepository) {
        this.productRepository = productRepository;
        this.itemRepository = itemRepository;
    }

    @GetMapping("/item/new/{productId}")
    private String createNewItem(@PathVariable("productId") Long productId) {
    Optional<Product> optionalProduct = productRepository.findById(productId);

    if (optionalProduct.isPresent()){
        Item item = new Item();
        item.setProduct(optionalProduct.get());
        itemRepository.save(item);
    }


    return "redirect:/";
    }



}
