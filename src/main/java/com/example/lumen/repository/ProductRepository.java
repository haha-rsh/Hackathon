package com.example.lumen.repository;

import com.example.lumen.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);

    List<Product> findByCategory(String category);

    List<Product> findByStockLevelLessThan(Integer stockLevel);
}
