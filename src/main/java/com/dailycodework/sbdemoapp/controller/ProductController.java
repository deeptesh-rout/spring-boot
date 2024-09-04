package com.dailycodework.sbdemoapp.controller;

import com.dailycodework.sbdemoapp.model.Product;
import com.dailycodework.sbdemoapp.service.IProductService;
import com.dailycodework.sbdemoapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("unused")
@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final IProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}/product")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody  Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product,@RequestParam Long id) {
        return productService.updateProduct(product, id);
    }
    
    @DeleteMapping("/{id}/delete")
    public void deleteProduct(@PathVariable Long id) {
         productService.deleteProduct(id);
    }
}
