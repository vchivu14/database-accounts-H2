package com.example.databasedemo2.data.repository;

import com.example.databasedemo2.data.entity.Invoices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepository extends CrudRepository<Invoices, Integer> {
}
