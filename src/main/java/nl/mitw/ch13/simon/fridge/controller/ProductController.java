package nl.mitw.ch13.simon.fridge.controller;

import nl.mitw.ch13.simon.fridge.model.Product;
import nl.mitw.ch13.simon.fridge.repositories.BrandRepository;
import nl.mitw.ch13.simon.fridge.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Simon Hiemstra
 * Purpose: handle all request regarding the fridge
 **/

@Controller
public class ProductController {
    private final ProductRepository productRepository;
    private final BrandRepository brandRepository;

    public ProductController(ProductRepository productRepository, BrandRepository brandRepository) {
        this.productRepository = productRepository;
        this.brandRepository = brandRepository;
    }


    @GetMapping({"/", "/product"})
    private String showProductOverview(Model model) {

        model.addAttribute("allProducts", productRepository.findAll());
        return "ProductOverview";
    }



    @GetMapping("/product/new")
    private String showProductForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("allBrands", brandRepository.findAll());

        return "ProductForm";
    }

    @PostMapping("/product/new")
    private String saveProduct(@ModelAttribute("product") Product productToBeSaved, BindingResult result) {
        if (!result.hasErrors()) {
            productRepository.save(productToBeSaved);

        }

        return "redirect:/";
    }



}
