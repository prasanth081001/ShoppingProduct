package com.example.Shopping.ShoppingProduct.Controller;

import com.example.Shopping.ShoppingProduct.Entity.Product;
import com.example.Shopping.ShoppingProduct.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id){
        return productService.getProductById(id);

    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product) ;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id,@RequestBody Product product){

        Product existingProduct=productService.getProductById(id) ;
        if (existingProduct!=null){
            existingProduct.setName(product.getName());

            existingProduct.setPrice(product.getPrice());

            return productService.saveProduct(existingProduct) ;
        }else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id){

        productService.deleteProduct(id);
    }
    }





