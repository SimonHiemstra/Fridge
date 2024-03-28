package nl.mitw.ch13.simon.fridge.controller;


import nl.mitw.ch13.simon.fridge.repositories.BrandRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrandController {
    private final BrandRepository brandRepository;

    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }



}
