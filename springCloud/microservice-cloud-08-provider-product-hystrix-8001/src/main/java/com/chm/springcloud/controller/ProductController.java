package com.chm.springcloud.controller;

import com.chm.springcloud.entity.Product;
import com.chm.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "getFallback")
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);

        // 模拟异常
        if (product == null) {
            throw new RuntimeException("ID = " + id + " 无效！");
        }

        return product;
    }

    /*
     * 若上面的方法出现异常，则会调用此方法
     *  注意：此方法的返回值、参数列表都必须与原方法一致。
     */
    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id, "ID=" + id + "无效--@HystrixCommand", "查无此数据库");
    }

    @GetMapping("/product/list")
    public List<Product> list() {
        return productService.list();
    }
}
