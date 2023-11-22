package com.royli.springbootmall.service;

import com.royli.springbootmall.dto.CreateOrderRequest;
import com.royli.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
