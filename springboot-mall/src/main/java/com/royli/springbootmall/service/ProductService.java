package com.royli.springbootmall.service;

import com.royli.springbootmall.dto.ProductRequest;
import com.royli.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
