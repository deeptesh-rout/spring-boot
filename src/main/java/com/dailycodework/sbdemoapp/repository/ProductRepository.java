package com.dailycodework.sbdemoapp.repository;

import com.dailycodework.sbdemoapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
