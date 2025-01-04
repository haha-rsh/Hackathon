package com.example.lumen.service;

import com.example.lumen.model.Product;
import com.example.lumen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> searchProducts(String name, String category, Integer stockLevel) {
        if (name != null) {
            return productRepository.findByCategory(category);
        }
        if (stockLevel != null) {
            return productRepository.findByStockLevelLessThan(stockLevel);
        }
        return productRepository.findAll();
    }
}
