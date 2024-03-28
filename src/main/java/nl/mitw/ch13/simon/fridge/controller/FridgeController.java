package nl.mitw.ch13.simon.fridge.controller;

import nl.mitw.ch13.simon.fridge.model.Item;
import nl.mitw.ch13.simon.fridge.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon Hiemstra
 * Purpose: handle all request regarding the fridge
 **/

@Controller
public class FridgeController {
    private final ItemRepository itemRepository;

    public FridgeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @GetMapping("/")
    private String showFridgeOverview(Model model) {

        model.addAttribute("allItems", itemRepository.findAll());
        return "FridgeOverview";
    }




}
