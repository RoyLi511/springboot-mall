package com.royli.springbootmall.dao;

import com.royli.springbootmall.dto.ProductRequest;
import com.royli.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
