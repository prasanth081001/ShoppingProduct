package com.example.Shopping.ShoppingProduct.Service;

import com.example.Shopping.ShoppingProduct.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(long id);

    Product saveProduct(Product product);
    void deleteProduct(long id);
}
