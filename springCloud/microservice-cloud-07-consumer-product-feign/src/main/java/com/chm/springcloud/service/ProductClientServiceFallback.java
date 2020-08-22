package com.chm.springcloud.service;

import com.chm.springcloud.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductClientServiceFallback implements ProductClientService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "ID=" + id + "无数据--feign&hystrix", "查无此数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
