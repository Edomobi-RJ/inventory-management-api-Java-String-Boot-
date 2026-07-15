package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByQuantityLessThan(Integer quantity);

    List<Product> findByStatus(String status);

    List<Product> findBySupplierContainingIgnoreCase(String supplier);
}
