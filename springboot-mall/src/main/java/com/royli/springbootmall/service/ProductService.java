package com.royli.springbootmall.service;

import com.royli.springbootmall.dao.ProductQueryParams;
import com.royli.springbootmall.dto.ProductRequest;
import com.royli.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
