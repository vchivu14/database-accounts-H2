package com.example.databasedemo2.web;

import com.example.databasedemo2.data.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountsController {
    private final AccountsRepository accountRepository;

    @Autowired
    public AccountsController(AccountsRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("/accounts")
    public String getAuthors(Model model) {
        model.addAttribute("accounts", accountRepository.findAll());
        return "accounts";
    }

}


