package com.example.databasedemo2.data.bootstrap;

import com.example.databasedemo2.data.entity.Accounts;
import com.example.databasedemo2.data.entity.Invoices;
import com.example.databasedemo2.data.entity.Terms;
import com.example.databasedemo2.data.entity.Vendors;
import com.example.databasedemo2.data.repository.AccountsRepository;
import com.example.databasedemo2.data.repository.InvoicesRepository;
import com.example.databasedemo2.data.repository.TermsRepository;
import com.example.databasedemo2.data.repository.VendorsRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private final AccountsRepository accountsRepository;
    private final InvoicesRepository invoicesRepository;
    private final TermsRepository termsRepository;
    private final VendorsRepository vendorsRepository;

    public DevBootstrap(AccountsRepository accountsRepository, InvoicesRepository invoicesRepository, TermsRepository termsRepository, VendorsRepository vendorsRepository) {
        this.accountsRepository = accountsRepository;
        this.invoicesRepository = invoicesRepository;
        this.termsRepository = termsRepository;
        this.vendorsRepository = vendorsRepository;
    }

    private void initData() {
        Terms term = new Terms("Net due 10 days",10);
        termsRepository.save(term);
        Accounts account = new Accounts(100,"Cash");
        accountsRepository.save(account);
        Vendors vendor = new Vendors("Intel", "Hall Blvd", "Beaverton", "503-255", "Doe", "John", term, account);
        vendorsRepository.save(vendor);
        Invoices invoice = new Invoices("123A", "22-11-2020", 10990.33f, 10000, 990.33f, "22-12-2020", null, term, vendor);
        invoicesRepository.save(invoice);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
