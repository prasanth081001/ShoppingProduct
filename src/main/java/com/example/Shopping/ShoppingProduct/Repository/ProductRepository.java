package com.example.Shopping.ShoppingProduct.Repository;

import com.example.Shopping.ShoppingProduct.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
