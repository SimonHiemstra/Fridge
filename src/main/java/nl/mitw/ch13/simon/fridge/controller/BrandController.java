package nl.mitw.ch13.simon.fridge.controller;


import nl.mitw.ch13.simon.fridge.model.Brand;
import nl.mitw.ch13.simon.fridge.repositories.BrandRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrandController {
    private final BrandRepository brandRepository;

    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @GetMapping("/brand")
    private String showAllBrands(Model model) {
        model.addAttribute("allBrands", brandRepository.findAll());
        model.addAttribute("newBrand", new Brand());
        return "brandOverview";
    }

    @PostMapping("/brand/new")
    private String saveOrUpdateBrand(@ModelAttribute("newBrand") Brand brand, BindingResult result) {
        if (!result.hasErrors()) {
            brandRepository.save(brand);
        }

        return "redirect:/brand";
    }

}
