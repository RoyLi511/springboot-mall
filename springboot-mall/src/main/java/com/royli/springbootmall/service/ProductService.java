package com.royli.springbootmall.service;

import com.royli.springbootmall.constant.ProductCategory;
import com.royli.springbootmall.dto.ProductRequest;
import com.royli.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
