package com.example.databasedemo2.web;

import com.example.databasedemo2.data.repository.VendorsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendorsController {
    private final VendorsRepository vendorsRepository;

    public VendorsController(VendorsRepository vendorsRepository) {
        this.vendorsRepository = vendorsRepository;
    }

    @RequestMapping("/vendors")
    public String getVendors(Model model) {
        model.addAttribute("vendors", vendorsRepository.findAll());
        return "vendors";
    }
}
