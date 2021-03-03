package com.example.databasedemo2.web;

import com.example.databasedemo2.data.repository.InvoicesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoicesController {
    private final InvoicesRepository invoicesRepository;

    public InvoicesController(InvoicesRepository invoicesRepository) {
        this.invoicesRepository = invoicesRepository;
    }

    @RequestMapping("/invoices")
    public String getInvoices(Model model) {
        model.addAttribute("invoices", invoicesRepository.findAll());
        return "invoices";
    }

}
