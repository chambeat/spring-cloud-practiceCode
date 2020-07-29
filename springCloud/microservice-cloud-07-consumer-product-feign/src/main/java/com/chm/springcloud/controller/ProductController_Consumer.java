package com.chm.springcloud.controller;

import com.chm.springcloud.entity.Product;
import com.chm.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController_Consumer {

    @Autowired
    ProductClientService productClientService;

    private static final String REST_URL_PREFIX = "http://microservice-product";

    @RequestMapping("/consumer/product/add")
    public boolean add(Product product) {
        return productClientService.add(product);
    }

    @RequestMapping("/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productClientService.get(id);
    }

    @RequestMapping("/consumer/product/list")
    public List<Product> list() {
        return productClientService.list();
    }
}
