package com.example.lumen.service;


import com.example.lumen.model.StockTransaction;
import com.example.lumen.repository.StockTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockTransactionService {

    @Autowired
    private StockTransactionRepository stockTransactionRepository;

    public StockTransaction createTransaction(StockTransaction transaction) {
        return stockTransactionRepository.save(transaction);
    }
}

