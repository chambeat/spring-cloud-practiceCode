package com.chm.springcloud.entity;

import java.io.Serializable;

public class Product implements Serializable { //必须序列化

    private Long pid; //主键
    private String productName; //商品名称
    // 来自哪个数据库(因为微服务架构可以"一个服务对应一个数据库"，同一个信息可以被存储到不同的数据库。)
    private String dbSource;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(Long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
