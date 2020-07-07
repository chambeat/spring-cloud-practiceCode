package com.chm.springcloud.controller;

import com.chm.springcloud.entity.Product;
import com.chm.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping("/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @GetMapping("/product/list")
    public List<Product> list() {
        return productService.list();
    }
}
