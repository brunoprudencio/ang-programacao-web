package com.brubatera.concessionaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brubatera.concessionaria.model.AutomobileServicing;

@Repository
public interface AutomobileRepository extends JpaRepository<AutomobileServicing, Long> {
}
