package com.royli.springbootmall.service;

import com.royli.springbootmall.dto.CreateOrderRequest;
import com.royli.springbootmall.dto.OrderQueryParams;
import com.royli.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
