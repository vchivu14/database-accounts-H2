package com.example.databasedemo2.data.repository;

import com.example.databasedemo2.data.entity.Terms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsRepository extends CrudRepository<Terms, Integer> {
}
