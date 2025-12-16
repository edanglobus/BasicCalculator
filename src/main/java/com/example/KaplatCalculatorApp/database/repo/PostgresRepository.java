package com.example.KaplatCalculatorApp.database.repo;

import com.example.KaplatCalculatorApp.database.DTO.CalculatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgresRepository extends JpaRepository<CalculatorEntity, Integer> {
}
