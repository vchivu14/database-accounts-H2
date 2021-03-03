package com.example.databasedemo2.data.repository;

import com.example.databasedemo2.data.entity.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Integer> {
}
