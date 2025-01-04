package com.example.lumen.repository;

import com.example.lumen.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    Product findByName(String name);

    List<Product> findByCategory(String category);

    List<Product> findByStockLevelLessThan(Integer stockLevel);

    @Query("SELECT p FROM Product p WHERE " +
            "(:name IS NULL OR p.name = :name) AND " +
            "(:category IS NULL OR p.category = :category) AND " +
            "(:stockLevel IS NULL OR p.stockLevel = :stockLevel)")
    List<Product> searchProducts(
            @Param("name") String name,
            @Param("category") String category,
            @Param("stockLevel") Integer stockLevel
    );
}
