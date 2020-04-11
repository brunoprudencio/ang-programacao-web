package com.brubatera.concessionaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brubatera.concessionaria.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
