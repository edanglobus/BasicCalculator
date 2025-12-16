package com.example.KaplatCalculatorApp.database.repo;

import com.example.KaplatCalculatorApp.database.DTO.CalculatorDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MangoRepository extends MongoRepository<CalculatorDocument, String> {



}
