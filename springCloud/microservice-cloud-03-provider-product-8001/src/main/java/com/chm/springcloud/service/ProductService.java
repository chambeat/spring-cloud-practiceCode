package com.chm.springcloud.service;

import com.chm.springcloud.entity.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
